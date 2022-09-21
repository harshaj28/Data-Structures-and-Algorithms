class Solution {
    public int change(int amount, int[] coins) {
        return helper(amount,coins,0,new HashMap<>());
    }
    public int helper(int amount,int[]coins,int ci,HashMap<String,Integer> map){
        if(amount==0){
            return 1;
        }
        if(ci>=coins.length){
            return 0;
        }
        
        String currKey=Integer.toString(amount)+"-"+Integer.toString(ci);
        if(map.containsKey(currKey)){
            return map.get(currKey);
        }
        
        int curAmount=coins[ci];
        int take=0;
        if(curAmount<=amount){
            take=helper(amount-curAmount,coins,ci,map);
        }
        int notTake=helper(amount,coins,ci+1,map);
        map.put(currKey,take+notTake);
        return take+notTake;
    }
}
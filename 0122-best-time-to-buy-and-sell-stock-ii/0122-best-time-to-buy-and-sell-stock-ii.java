class Solution {
    public int maxProfit(int[] prices) {
        return helper(prices,1,0,new HashMap<>());
    }
    public int helper(int prices[],int canBuy,int currDay,HashMap<String,Integer> map){
        if(currDay>=prices.length){
            return 0;
        }
        String currIdx= canBuy+"-"+currDay;
        if(map.containsKey(currIdx)){
            return map.get(currIdx);
        }
        int ans=0;
        if(canBuy==1){
            int idle=helper(prices,canBuy,currDay+1,map);
            int buy=-prices[currDay]+helper(prices,canBuy-1,currDay+1,map);
            ans=Math.max(idle,buy);
        }else{
            int idle=helper(prices,canBuy,currDay+1,map);
            int sell=prices[currDay]+helper(prices,canBuy+1,currDay+1,map);
            map.put(currIdx,Math.max(idle,sell));
            ans=Math.max(idle,sell);
        }
        map.put(currIdx,ans);
        return ans;
    }
}
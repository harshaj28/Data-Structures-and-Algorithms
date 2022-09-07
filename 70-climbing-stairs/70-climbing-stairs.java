class Solution {
    public int climbStairs(int n) {
        return helper(n,0,new HashMap<Integer,Integer>());
    }
    public int helper(int n, int x,HashMap<Integer,Integer> map){
        if(x==n){
            return 1;
        }
        if(x>n){
            return 0;
        }
        if(map.containsKey(x)){
            return map.get(x);
        }
        int jumpOne=helper(n,x+1,map);
        int jumpTwo=helper(n,x+2,map);
        
        map.put(x,jumpOne+jumpTwo);
        return jumpOne+jumpTwo;
    }
}
class Solution {
    public int fib(int n) {
        return helper(n,new HashMap<Integer,Integer>());
    }
    public int helper(int n,HashMap<Integer,Integer> map) {
        if(n <= 1) return n;
        if(map.containsKey(n)){
            return map.get(n);
        }
        map.put(n,helper(n-1,map)+helper(n-2,map));
        return helper(n-1,map)+helper(n-2,map);
    }
}
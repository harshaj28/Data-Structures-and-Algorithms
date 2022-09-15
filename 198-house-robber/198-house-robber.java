class Solution {
    public int rob(int[] nums) {
        return maxMoney(nums,0,new HashMap<>());
    }
    private int maxMoney(int[]nums,int x,HashMap<Integer,Integer> map){
        if(x>=nums.length){
            return 0;
        }
        if(map.containsKey(x)){
            return map.get(x);
        }
        int ans=Math.max(nums[x]+maxMoney(nums,x+2,map),maxMoney(nums,x+1,map));
        map.put(x,ans);
        return ans;
    }
}
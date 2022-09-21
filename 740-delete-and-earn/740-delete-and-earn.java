class Solution {
    public int deleteAndEarn(int[] nums) {
        int n= nums.length;
        int max =nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i]>max)
                max = nums[i];
        }
        int[] freq = new int[max+1];
        for(int i:nums)
            freq[i] = freq[i]+1;
        return helper(nums,freq,0,new HashMap<>());
    }
    public int helper(int[]nums,int[]freq,int ci,HashMap<Integer,Integer> map){
        if(ci>=freq.length){
            return 0;
        }
        
        if(map.containsKey(ci)){
            return map.get(ci);
        }
        
        int take=(ci*freq[ci])+helper(nums,freq,ci+2,map);
        int notTake=helper(nums,freq,ci+1,map);
        map.put(ci,Math.max(take,notTake));
        return Math.max(take,notTake);
    }
}
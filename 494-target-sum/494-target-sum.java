class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0);
    }
    public int helper(int []nums,int target,int counter){
        if(counter==nums.length&&target==0){
            return 1;
        }
        if(counter==nums.length&&target!=0){
            return 0;
        }
        
        int neg=helper(nums,target-nums[counter],counter+1);
        int pos=helper(nums,target+nums[counter],counter+1);
        
        return neg+pos;
    }
}
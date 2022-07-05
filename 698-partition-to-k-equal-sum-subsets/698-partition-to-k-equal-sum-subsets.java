class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        if(k > nums.length) return false;
        int sum = 0;
        for(int i : nums) sum += i;
        if(sum % k != 0) return false;
        int target = sum/k;
        boolean[] used = new boolean[nums.length];
        return backTrack(nums, k, target, 0, 0, used);                                      
    }

    public boolean backTrack(int[] nums, int k, int target, int sum, int start,boolean[] used){
        if(k == 0){
            return true;
        }
        if(sum == target){
            return backTrack(nums, k-1, target, 0, 0, used);
        }
        for(int i = start; i < nums.length; i++){
            if(used[i]){
                continue;
            }
            if(sum + nums[i] > target){
                continue;
            }
            sum += nums[i];
            used[i] = true;
            if(backTrack(nums, k, target, sum, i+1, used)){ 
                return true;
            }
            used[i] = false;
            sum -= nums[i];
        }
        return false;
    }
}   
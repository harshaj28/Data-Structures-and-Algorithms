class Solution {
    public int searchInsert(int[] nums, int target) {
        int f = 0;
        int l = nums.length -1;
        int ans=-1;
        while(f <= l){
            int m = f+(l-f)/2;
            if(nums[m] == target){
                return m;
            }
            else if(nums[m] < target){
                ans=m;
                f=m+1;
            }
            else
                l=m-1;
        }
        return ans + 1;
    }
}
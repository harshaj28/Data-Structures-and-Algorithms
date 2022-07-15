class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1||nums.length==k){
            return;
        }
        if(k > nums.length) k = k % nums.length;
        int[]ans=new int[nums.length];
        int j=0;
        for(int i=nums.length-k;i<nums.length;i++){
            ans[j++]=nums[i];
        }
        for(int i=0;i<nums.length-k;i++){
            ans[j++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
    }
}
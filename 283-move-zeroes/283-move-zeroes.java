class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=1;
        int n=nums.length;
        if(n==0||n==1)
            return;
        while(nums[i]!=0 && i<=n){
            i++;
            if(i==n-1)
                return;
        }
        j=i+1;
        while(j<n){
            if(nums[j]==0)
                j++;
            else {
                nums[i]=nums[j];
                nums[j]=0;
                i++;
                j++;
            }
        }
    }
}
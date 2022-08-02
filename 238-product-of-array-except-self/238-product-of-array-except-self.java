class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum = 1;
        int zeros = 0;
        for(int i : nums){
            if (i != 0) 
                sum *= i;
            else 
                zeros++;
        }
        int[] ans = new int[nums.length];
        if(zeros == 0){
            for(int i = 0 ; i<nums.length; i++)
                ans[i] = sum/nums[i];
        }
        else if(zeros == 1){
            for(int i = 0 ; i<nums.length; i++)
                if (nums[i]==0)
                    ans[i] = sum;
        }
        return ans;
    }
}
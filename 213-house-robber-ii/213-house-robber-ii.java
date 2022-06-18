class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int prev = nums[1];
        int prev2 = 0;         
        for(int i=2;i<n;i++){
            int pick = nums[i];
            if(i>1) pick+=prev2;
            int not_pick = prev;
            
            int curr = Math.max(pick, not_pick);
            prev2 = prev;
            prev = curr;
        }
        int ans1 = prev;
        prev = nums[0];
        prev2=0;
        for(int i=1;i<n-1;i++){
            int pick = nums[i];
            if(i>1) pick+=prev2;
            int not_pick = prev;
            
            int curr = Math.max(pick, not_pick);
            prev2 = prev;
            prev = curr;
        }
        int ans2 = prev;
        return Math.max(ans1, ans2);
    }
}
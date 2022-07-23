class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0,c=0;
        for(int n:nums){
            if(n==0){
                 ans += ++c;
            }
            else{
                c=0;
            }
        }
        return ans;
    }
}
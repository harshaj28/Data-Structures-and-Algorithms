class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int pairs = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==nums[i - 1]){
                nums[i] = -1;
                pairs++;
            }
        }
        return new int[] {pairs , nums.length - (2* pairs)};
    }
}
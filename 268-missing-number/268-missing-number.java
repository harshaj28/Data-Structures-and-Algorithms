class Solution {
    public int missingNumber(int[] nums) {
        int sum = (nums.length)*(nums.length+1)/2;
        for(int value : nums) {
            sum -= value;
        }
        return sum;
    }
}
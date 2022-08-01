class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0,index = 0,sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        while(index != nums.length && (leftSum != (sum - leftSum - nums[index]))){
            leftSum += nums[index++];
        }
        if(index == nums.length){
            return -1;
        }
        return index;
    }
}
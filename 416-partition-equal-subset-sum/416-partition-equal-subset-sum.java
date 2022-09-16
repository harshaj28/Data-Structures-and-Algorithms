class Solution {
    public boolean canPartition(int[] nums) {
        int totalsum=0;
        for(int i:nums){
            totalsum+=i;
        }
        if(totalsum%2!=0){
            return false;
        }
        return helper(nums,totalsum/2,0,new HashMap<>());
    }
    public boolean helper(int []nums,int target,int currIndex,HashMap<String,Boolean> map){
        if(target==0){
            return true;
        }
        if(currIndex>=nums.length){
            return false;
        }
        String currKey=Integer.toString(target)+"-"+Integer.toString(currIndex);
        if(map.containsKey(currKey)){
            return map.get(currKey);
        }
        
        boolean consider=false;
        if(nums[currIndex]<=target){
            consider= helper(nums,target-nums[currIndex],currIndex+1,map);
            if(consider==true){
                return true;
            }
        }
        boolean notConsider=helper(nums,target,currIndex+1,map);
        map.put(currKey,consider||notConsider);
        return consider||notConsider;
    }
}
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,new HashMap<>());
    }
    public int helper(int []nums,int target,int counter,HashMap<String,Integer> map){
        if(counter==nums.length&&target==0){
            return 1;
        }
        if(counter==nums.length&&target!=0){
            return 0;
        }
        
        String currKey= Integer.toString(target)+"-"+Integer.toString(counter);
        if(map.containsKey(currKey)){
            return map.get(currKey);
        }
        int neg=helper(nums,target-nums[counter],counter+1,map);
        int pos=helper(nums,target+nums[counter],counter+1,map);
        map.put(currKey,neg+pos);
        return neg+pos;
    }
}
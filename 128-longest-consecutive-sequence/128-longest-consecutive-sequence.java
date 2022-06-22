class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map=new HashSet<Integer>();

        for(int xd:nums){
            map.add(xd);
        }  
        int ans=0;
        for (int num:nums) {
            if(!map.contains(num-1)){
                int curr=num;
                int currstreak=1;
                while(map.contains(curr+1)){
                    curr+=1;
                    currstreak+=1;
                    
                }
                ans=Math.max(ans,currstreak);
            }
        }
        return ans;
    }
}
class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = -1;
        for (int item : nums) {
            int key = 0;
            int x=item;
            while(x>0){
                key+=x%10;
                x=x/10;
            }
            if (!map.containsKey(key))
                map.put(key, item);
            else {
                result = Math.max(result, map.get(key) + item);
                map.put(key, Math.max(map.get(key), item));
            }
        }

        return result;
    }
}
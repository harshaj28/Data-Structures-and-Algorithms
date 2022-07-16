class Solution {
    public int[] twoSum(int[] num, int target) {
        int arr[]=new int[2];
        int f=0;
		int l=num.length-1;
        while(f<l){
            int sum=0;
            sum=num[f]+num[l];
            if(sum>target){
                l--;
            }
            else if(sum==target){
                arr[0]=++f;
                arr[1]=++l;
                return arr;
            }
            else{
                f++;
            }
        }
        return arr;
    }
}
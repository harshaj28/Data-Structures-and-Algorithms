class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         if(nums1.length==0&nums2.length==0){
            return 0;
        }
        int[]ansArr=new int[nums1.length+nums2.length];
        int n1=0,n2=0;
        for(int i=0;i<ansArr.length;i++){
            if(n2>=nums2.length||(n1<nums1.length&&nums1[n1]<=nums2[n2])){
                ansArr[i]=nums1[n1];
                n1++;
            }else{
                ansArr[i]=nums2[n2];
                n2++;
            }
        }
        if(ansArr.length%2==1){
            return ansArr[ansArr.length/2];
        }else{
            return (ansArr[(ansArr.length/2)-1]+ansArr[(ansArr.length/2)])/2.0;
        }
    }
}
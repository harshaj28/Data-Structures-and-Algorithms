class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> al = new ArrayList<>();
        fun(arr,0,new ArrayList<>(),al);
        return al;
    }
    public void fun(int[] arr,int idx,List<Integer> ds,List<List<Integer>> al){
         if(idx>=arr.length){
           if(!al.contains(ds)){
               al.add(new ArrayList<>(ds));
           }
           return;
         } 
         ds.add(arr[idx]);
         fun(arr,idx+1,ds,al);
         ds.remove(ds.size()-1);
         fun(arr,idx+1,ds,al);   
    }
}
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> res=new ArrayList<>();
        helper(0,s,ans,res);
        return ans;
    }
    
    public static void helper(int idx,String s,List<List<String>> ans,List<String> res){
        if(idx>=s.length()){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                res.add(s.substring(idx,i+1));
                helper(i+1,s,ans,res);
                res.remove(res.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
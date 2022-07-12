class Solution {
    public boolean canChange(String string, String target) {
        int n=target.length();
        int i=0,j=0;
        while(i<n || j<n){
            
            while(i<n && target.charAt(i)=='_') i++;
            while(j<n && string.charAt(j)=='_') j++;
            
            if(i==n || j==n){
                return i==n && j==n;
            }
            
            if(target.charAt(i)!=string.charAt(j)) return false;
            
            if(target.charAt(i)=='L'){
                if(j<i) return false;
            }
            else{
                if(i<j) return false;
            }
            
            i++;
            j++;
        }
        return true;
    }
}
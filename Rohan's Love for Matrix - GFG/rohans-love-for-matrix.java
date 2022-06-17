// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.firstElement(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution {
    int firstElement(int n) 
    {
        int prev2 = 0, prev = 1;
        for(int i=2; i<=n; i++){
            int curr =( prev2 + prev)%1000000007;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}
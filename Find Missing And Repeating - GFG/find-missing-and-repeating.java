// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int input[], int n) {
        int[]ans=new int[2];
        boolean[]present=new boolean[n+1];
        for (int i=1;i<=n;i++){
            present[i]=false;
        }
        for (int i=0;i<n;i++){
            if(present[input[i]]){
                ans[0]=input[i];
            }
            present[input[i]]=true;
        }
        for (int i=1;i<=n;i++){
            if(!present[i]){
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}
//Initial Template for Java

import java.util.Scanner;

class Main {

    
 // } Driver Code Ends
//User function Template for Java

public static void utility(int a, int b, int c){
    
    //write your code here
int ans=Math.max(a,b);
int result=Math.max(ans,c);
System.out.println(result);
}

// { Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            utility(a,b,c);
        }
        scn.close();
    }
}  // } Driver Code Ends

//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
 // } Driver Code Ends
//User function Template for Java

public static int fibonacci(int n){
        
    //Write your code here to calculate
    //to calculate the nth fibonacci number
    int num1=1,num2=1,sum=0;
    for(int i=3; i<=n; i++)
    {
        sum = num1+num2;
        num1 = num2;
        num2 = sum;
   
    }
    return sum;
        
}

// { Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int ans = fibonacci(n);
            System.out.println(ans);
        }
        scn.close();
    }
}  // } Driver Code Ends


import java.io.*;

class GFG{
    public static void main(String arg[]) throws IOException{
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            
            int answer = firstDigit(n);
            System.out.println(answer);
        }
    }
    
    
 // } Driver Code Ends
//User function Template for Java


// Complete the function
public static int firstDigit(int n){
    // code here
    int no = n;
    int temp = 0;
    while(no>0)
    {
        int remain = no%10;
        temp = remain;
        no = no/10;
    }
    return temp;
}

// { Driver Code Starts.
}  // } Driver Code Ends

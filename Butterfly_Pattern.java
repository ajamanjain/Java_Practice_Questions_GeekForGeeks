import java.util.*;

class ButterflyPattern
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
		  int j=1;
          while(j<=i)
          {
              System.out.print(" *");
              j++;
          }

          int k=2*(n-i);
          while(k>0)
          {
              System.out.print("  ");
              k--;
          }

          j=1;
          while(j<=i)
          {
              System.out.print("* ");
              j++;
          }

          i++;
          System.out.println();
		}

        i=n;
        while(i>=1)
		{
		  int j=1;
          while(j<=i)
          {
              System.out.print(" *");
              j++;
          }

          int k=2*(n-i);
          while(k>0)
          {
              System.out.print("  ");
              k--;
          }

          j=1;
          while(j<=i)
          {
              System.out.print("* ");
              j++;
          }

          i--;
          System.out.println();
		}
		
	}
}

import java.util.*;

public class ChefAndPriceControl
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
                
        for(int i=0; i<t; i++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] ar = new int[n];
            int sum = 0;
            
            for(int j=0; j<n; j++)
            {
                ar[j] = sc.nextInt();
                if(ar[j]>k)
                {
                    sum = sum + (ar[j]-k);
                }
            }
            
            System.out.println(sum);
        }
    }
}
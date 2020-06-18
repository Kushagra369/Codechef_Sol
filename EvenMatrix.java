import java.util.*;

public class EvenMatrix
{    
    static int anotherfunction(int i, int n, int x)
    {
        if(i%2==0)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(x+" ");
                x++;
            }
        }
        else
        {
            x = (i+1)*n;
            for(int j=0; j<n; j++)
            {
                System.out.print(x+" ");
                x--;
            }
            x = ((i+1)*n)+1;
        }
               
        System.out.println();
        
        return x;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0)
        {
            t--;
            
            int n = sc.nextInt();
            int x=1;
            
            for(int i=0; i<n; i++)
            {
                x = anotherfunction(i, n, x);
            }
        }
    }
}
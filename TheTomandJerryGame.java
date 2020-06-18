import java.util.*;
import java.lang.*;

public class TheTomandJerryGame
{    
    static int twofactor(long TS)
    {
        int count = 0;
        while(TS%2==0)
        {
            TS = TS/2;
            count++;
        }
        
        return count;
    }
    
    static boolean oddfact(long TS)
    {
        while(TS%2==0)
        {
            TS = TS/2;
        }
        
        return TS != 1;
        
    }
    
    static long countnum(long f, long TS)
    {
        long count = TS/f;
        return count;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0)
        {
            t--;
            long TS = sc.nextLong();
            long JS;
            
            if(TS%2==1)
            {
                JS = TS/2;
            }
            else
            {
                int x = twofactor(TS);
                if (oddfact(TS))
                {
                    long f = (long)Math.pow(2, x+1);
                    JS = countnum(f, TS);
                } 
                else 
                {
                    JS=0;
                }
            }
            
            System.out.println(JS);
        }
    }
}
import java.util.*;

public class ChefAndString
{    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0)
        {
            t--;
            String s = sc.next();
            int n = s.length();
            int count = 0;
            for(int i=0; i<n-1; i++)
            {
                if(s.charAt(i)!=s.charAt(i+1))
                {
                    count++;
                    i++;
                }
            }
            
            System.out.println(count);
        }
    }
}
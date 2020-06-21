import java.util.*;

public class MarkingTheBorders
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
      	for(int j=0; j<t; j++)
      	{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count=0;
            int flag=0;
            int sum=0;

            int m = r/(a+b);
            int n = r%(a+b);
	    	if(n>=a)
	    	{
				m = 2*m + 1;
	    	}
	    	else
	    	{
				m = 2*m;
	    	}

	    	n = l/(a+b);
	    	n = 2*n;
	    	flag = l%(a+b);
	    	if(flag==0 && l!=0)
	    	{
				n--;
	    	}
	    
	    	if(flag>a)
	    	{
				n++;
	    	}

	    	count = m - n;

            System.out.println(count);
      	} 
    }
}
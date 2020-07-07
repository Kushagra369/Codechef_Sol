import java.util.*;
public class ChefAndCardGame {

	public static int stringsum(String a, String b)
	{
		int sum = 0;
		int sum2 = 0;
		for(int i=0; i<a.length(); i++)
		{
			sum = sum + (int)a.charAt(i) - 48;
		}
		
		for(int i=0; i<b.length(); i++)
		{
			sum2 = sum2 + (int)b.charAt(i) - 48;
		}
		
		int ans = -1;
		
		if(sum>sum2)
		{
			ans = 0;
		}
		else if(sum2>sum)
		{
			ans = 1;
		}
		else
		{
			ans = 2;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0)
		{
			int n = sc.nextInt();
			int c = 0;
			int m = 0;
			for(int i=0; i<n; i++)
			{
				String a = sc.next();
				String b = sc.next();
				int comp = stringsum(a, b);
				if(comp==0)
				{
					c++;
				}
				else if(comp==1)
				{
					m++;
				}
				else
				{
					c++;
					m++;
				}
			}
			
			if(c>m)
			{
				System.out.println("0 "+c);
			}
			else if(m>c)
			{
				System.out.println("1 "+m);
			}
			else if(c==m)
			{
				System.out.println("2 "+c);
			}
		}
		sc.close();
	}

}

import java.util.*;

public class CacheHits 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int z=0; z<t; z++)
		{
			int n = sc.nextInt();
			int b = sc.nextInt();
			int m = sc.nextInt();
			
			int temp;
			int cache=-1;
			int count=0;
			
			int[] access = new int[m];
			for(int i=0; i<m; i++)
			{
				access[i] = sc.nextInt();
				if(access[i]<n)
				{
					temp = access[i]/b;
					
					if(temp!=cache)
					{
						count++;
						cache = temp;
					}
				}
				else
				{
					cache=-1;
				}
				
			}
			sc.close();
			
			System.out.println(count);
		}
	}
}

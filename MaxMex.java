import java.util.*;

public class MaxMex 
{
	public static int checkmex(List<Integer> b)
	{
		int ans=0;
		int n = b.size();
		Collections.sort(b);
		for(int i=b.get(0); i<=b.get(n-1); i++)
		{
			if(b.contains(i)==false)
			{
				ans=i;
				break;
			}
		}
		
		return ans;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int z=0; z<t; z++)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			List<Integer> a = new ArrayList<>();
			
			for(int i=0; i<n; i++)
			{
				a.add(sc.nextInt());
			}
			
			
			int ans = -1;
			int flag = 0;
			
			for(int i=n; i>0; i--)
			{
				for(int j=0; j<=(n-i); j++)
				{
					List<Integer> b = a.subList(j, j+i);
					
					if(checkmex(b)==m)
					{
						ans = i;
						flag=1;
						break;
					}
				}
				
				if(flag==1)
				{
					break;
				}
			}
			
			System.out.println(ans);
		}
		sc.close();
	}
}

import java.util.*;
public class ChefAndStrings {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			long[] a = new long[n];
			long skip = 0;
			
			for(int i=0; i<n; i++)
			{
				a[i] = sc.nextInt();
				if(i>0)
				{
					skip = skip + Math.abs(a[i]-a[i-1]) -1;
				}
			}
			
			System.out.println(skip);
		}
		sc.close();
	}

}

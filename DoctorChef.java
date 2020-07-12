import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DoctorChef {

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			long x = sc.nextLong();
			long[] a= new long[n];
			int days = 0;
			
			for(int i=0; i<n; i++)
			{
				a[i] = sc.nextLong();
			}
			
			Arrays.sort(a);
			
			int lb=0;
			for(int i=0;i<n; i++)
			{
				if(a[i]>=x)
				{
					lb = i;
					break;
				}
			}
			
			if(x>=a[n-1])
			{
				System.out.println(n);
			}
			else 
			{
			
			for(int i=lb; i<n; i++)
		    {
		    	if(x<a[i])
		    	{
		    		while(x<a[i])
		    		{
		    			x = 2*x;
		    			days++;
		    		}
		    		days++;
		    	}
		    	else
		    	{
		    		days++;
		    	}

		    	x = 2*a[i];
		    }	
			
			long total = lb + days;
		    if(lb!=0)
		    {
		    	days=0;
		    	lb--;
		    	for(int i=lb; i<n; i++)
		    	{
		    		if(x<a[i])
		    		{
		    			while(x<a[i])
		    			{
		    				x = 2*x;
		    				days++;
		    			}
		    			days++;
		    		}
		    		else
		    		{
		    			days++;
		    		}

			    	x = 2*a[i];
		    	}
		    	
		    	long ans = Math.min(days+lb,total);
		    	System.out.println(ans);
		    }
		    else
		    {
		    	System.out.println(total);
		    }
			
			}
			
		}
	}

}

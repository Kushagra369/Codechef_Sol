import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class DoctorChef {

	static class FastReader 
	{
		BufferedReader br;
		StringTokenizer st;

		public FastReader() 
		{
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() 
		{
			while (st == null || !st.hasMoreElements()) 
			{
				try 
				{
					st = new StringTokenizer(br.readLine());
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() 
		{
			return Integer.parseInt(next());
		}

		long nextLong() 
		{
			return Long.parseLong(next());
		}

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine() 
		{
			String str = "";
			try 
			{
				str = br.readLine();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			return str;
		}
	}
	
	public static void main(String[] args) 
	{
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int x = sc.nextInt();
			List<Integer> more = new ArrayList<>();
			int days = 0;
			
			for(int i=0; i<n; i++)
			{
				int z = sc.nextInt();
				more.add(z);
			}
			
			if(more.get(0)<=x)
			{
				days = more.size();
			}
			else
			{
				int i = more.get(0);
				int initpop = i;
				while(i>0)
				{
					if(x>i)
					{
						x = 2*x;
						i = 0;
						days++;
					}
					else
					{
						i = i-x;
						x = 2*x;
						days++;
						if(i!=0)
						{
							i = Math.min(initpop, 2*i);
						}
					}
				}
				days = days + (n-1);
			}
			System.out.println(days);
		}
	}
}

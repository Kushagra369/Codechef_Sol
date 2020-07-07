import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;
	
public class MissingAPoint {

	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
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
			int[][] arr = new int[4*n-1][2];
			for(int i=0; i<(4*n)-1; i++)
			{
				arr[i][0] = sc.nextInt();
				arr[i][1] = sc.nextInt();
			}
			
			Arrays.sort(arr, new Comparator<int[]>()
			{
				public int compare(int[] a, int[] b)
				{
					if(a[0]>=b[0])
					{
						return 1;
					}
					else
					{
						return -1;
					}
				}
			});
			
			int x=0;
			int y=0;
			
			for(int i=0; i<arr.length; i+=2)
			{
				if(i<arr.length-1 && (arr[i][0]!=arr[i+1][0]))
				{
					x = arr[i][0];
					break;
				}
				
				if(i==(arr.length-1))
				{
					x = arr[i][0];
					break;
				}
			}
			
			Arrays.sort(arr, new Comparator<int[]>()
			{
				public int compare(int[] a, int[] b)
				{
					if(a[1]>=b[1])
					{
						return 1;
					}
					else
					{
						return -1;
					}
				}
			});
			
			for(int i=0; i<arr.length; i+=2)
			{
				if(i<arr.length-1 && (arr[i][1]!=arr[i+1][1]))
				{
					y = arr[i][1];
					break;
				}
				
				if(i==(arr.length-1))
				{
					y = arr[i][1];
					break;
				}
			}
				
			System.out.println(x+" "+y);
		}
	}

}

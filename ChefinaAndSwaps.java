import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;

public class ChefinaAndSwaps {

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
	
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			List<Integer> a = new ArrayList<>();
			List<Integer> b = new ArrayList<>();
			
			for(int i=0; i<n; i++)
			{
				a.add(sc.nextInt());
			}
			
			for(int i=0; i<n; i++)
			{
				b.add(sc.nextInt());
			}
			
			
		}
		
	}

}

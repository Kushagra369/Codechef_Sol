import java.util.*;

public class DoctorChef {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
			
			Collections.sort(more);
			
			if(more.get(0)<=x)
			{
				days = more.size();
			}
			else
			{
				for(int i: more)
				{
					int initpop = i;
					while(i>0)
					{
						if(x>i)
						{
							x = i;
							i = 0;
							days++;
							x = 2*x;
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
				}
			}
			
			System.out.println(days);
			
		}
		sc.close();
	}

}

import java.util.*;
public class AdaKing 
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int k = sc.nextInt();
			int count=1;
			char b;
			
			for(int i=0; i<8; i++)
			{
				for(int j=0; j<8; j++)
				{
					if(count==1)
					{
						b = 'O';
						System.out.print(b);
					}
					else if(count<=k)
					{
						b = '.';
						System.out.print(b);
					}
					else
					{
						b = 'X';
						System.out.print(b);
					}
					count++;
				}
				System.out.println();
			}
		}
		sc.close();
	}

}

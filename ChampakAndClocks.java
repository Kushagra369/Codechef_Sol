import java.util.*;

public class ChampakAndClocks
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for(int j=0; j<t; j++)
      {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count=0;

            for(int i=l; i<r; i++)
            {

                  count = count+2;

                  if(i==2 || i==14 || i==8 || i==20)
                  {
                        count--;
                  }

            }

            if(r==3 || r==15 || r==9 || r==21)
            {
                  count++;
            }

            System.out.println(count);
      }
      }
}
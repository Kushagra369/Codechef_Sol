import java.util.*;

public class ChefAndIcecream
{    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0)
        {
            t--;
            int n = sc.nextInt();
            int flag=0;
            List<Integer> c = new ArrayList<>();
            List<Integer> r = new ArrayList<>();
                                    
            for(int i=0; i<n; i++)
            {
                c.add(sc.nextInt());
            }
            
            if(c.get(0)!=5)
            {
                System.out.println("NO");
            }
            else
            {
                while(c.size()>0)
                {
                    if(c.get(0)==5)
                    {
                        c.remove(0);
                        r.add(5);
                    }
                    else if(c.get(0)==10 && r.contains(5))
                    {
                        c.remove(0);
                        r.add(10);
                        int x = r.indexOf(5);
                        r.remove(x);
                    }
                    else if(c.get(0)==15)
                    {
                        if(r.contains(10))
                        {
                            c.remove(0);
                            r.add(15);
                            int x = r.indexOf(10);
                            r.remove(x);
                        }
                        else if(r.contains(5))
                        {
                            int x = r.indexOf(5);
                            r.remove(x);
                            if(r.contains(5))
                            {
                                c.remove(0);
                                r.add(15);
                                int z = r.indexOf(5);
                                r.remove(z);
                            }
                            else
                            {
                                r.add(5);
                                flag=1;
                                break;
                            }
                        }
                        else 
                        {
                            flag=1;
                            break;
                        }
                    }
                    else 
                    {
                        flag=1;
                        break;
                    }
                }
                
                if(flag==0)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
        }
    }
}
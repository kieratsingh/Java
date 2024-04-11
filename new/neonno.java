import java.util.Scanner;
public class neonno
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        for(int i=1;i<=1000;i++)
        {
            int t=i*i;
            int s=0;
            while(t>0)
            {
                int d=t%10;
                s+=d;
                t/=10;
            }
            if(s==i)
            {
                System.out.print(i+"\n");
            }
        }
    }
}
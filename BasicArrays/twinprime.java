import java.util.Scanner;
public class twinprime
{
    static void twinprime(int x,int y)
    {
        int c1=0,c2=0,d;        
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                c1++;
            }
        }
        for(int i=1;i<=y;i++)
        {
            if(y%i==0)
            {
                c2++;
            }
        }
        d=Math.abs(x-y);
        if(d==2 && c1==2 && c2==2)
        {
            System.out.print("Numbers are twin prime");
        }
        else 
        {
            System.out.print("Numbers are not twinprime");
        }
    }
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int x=in.nextInt();
        System.out.print("Enter the second number :");
        int y=in.nextInt();
        twinprime(x,y);
        
    }
}
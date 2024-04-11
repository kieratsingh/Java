import java.util.*;
public class fibo
{
    int n,f,s,t;
    Scanner in = new Scanner(System.in);
    fibo()
    {
        System.out.print("Enter the number of terms :");
        n=in.nextInt();
        f=0;
        s=1;
    }
    void create()
    {
        if(n<1)
        {
            System.out.print("invalid ");
        }
        else if(n==1)
        {
            System.out.print(f);
        }
        else
        {
            System.out.print(f+","+s); 
            for(int i=3;i<=n;i++)
            {
                t=f+s;
                f=s;
                s=t;
                System.out.print(", " +t);
            }
        }        
    }
    public static void main()
    {
        fibo obj=new fibo();
        obj.create();
        fibo obj1= new fibo();
        obj1.create();
    }
}
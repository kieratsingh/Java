import java.util.Scanner;
public class funcoverld
{
    void series(int x,int n)
    {
        double s=0.0;
        for(int i=1;i<=n;i++)
        {
            s+=Math.pow(x,i);
        }
        System.out.print("Sum of series ="+ s);
    }
    void series(int p)
    {
        double s=0.0;
        for(int i=1;i<=p;i++)
        {
            s+=(i*i*i)-1;
        }
        System.out.print("Sum of series ="+ s);
    }
    void series()
    {
        double s=0.0;
        for(int i=2;i<=10;i++)
        {
            s+=1/i;
        }
        System.out.print("Sum of series ="+ s);
    }
}
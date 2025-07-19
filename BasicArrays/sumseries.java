import java.util.Scanner;
public class sumseries
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N :");
        int n=in.nextInt();
        double s=0.0,num=n;
        for(int i=1;i<=n;i++)
        {
            num*=n;
            s+=num/i;
        }
        System.out.print("Sum of series ="+ s);
    }
}
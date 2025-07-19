import java.util.Scanner;
public class seriessum
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms :");
        int n=in.nextInt();
        double s=0.0;
        for(double i=1,j=2;i<=n;i++,j++)
        {
            if(i%2==0)
            {
                i*=-1;
            }
            s+=i/j;
            i=Math.abs(i);
        }
        System.out.print("Sum of series =" +s);
    }
}
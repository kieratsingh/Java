import java.util.Scanner;
public class trianglefunc
{
    public static void pattern(int n)
    {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j +"\t");
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j +"\t");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n :");
        int n=in.nextInt();
        pattern(n);
    }
}
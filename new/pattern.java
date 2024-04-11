import java.util.Scanner;
public class pattern
{
    public static void main()
    {
        System.out.print("Enter n :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j +"\t");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
public class floydtriangle
{
    public static void main()
    {
        System.out.print("Enter the number of lines :");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int v=1;
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(v++ + "\t");
            }
            System.out.println();

        }
    }
}
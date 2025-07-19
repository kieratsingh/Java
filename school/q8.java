import java.util.Scanner;
public class MATRIX
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int r=in.nextInt();
        System.out.print("Enter the number of columns:");
        int c=in.nextInt();
        int a[][]=new int[r][c];
        int count=0;
        for(int i = 0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println("Enter row "+(i+1)+", column "+(j+1)+" :");
                a[i][j]=in.nextInt();
            }
        }
        System.out.print("\n------MATRIX------\n");
        for(int i = 0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
                if(a[i][j]/10!=0)
                {
                    count++;
                }
            }
            System.out.println();
        }
        System.out.print("\nCOUNT =" +count);
    }
}
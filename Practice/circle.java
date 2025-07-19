import java.util.Scanner;
public class circle
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int r=in.nextInt();
        System.out.print("Enter the number of columns:");
        int c=in.nextInt();
        int a[][]=new int[r][c];
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
            }
            System.out.println();
        }

        for(int i = 0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0 || i==r-1 || j==0 || j==c-1)
                {
                    System.out.print(a[i][j]+"\t");
                }

                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}


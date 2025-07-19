import java.util.Scanner;
public class rowsum
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int r=in.nextInt();
        System.out.print("Enter the number of columns:");
        int c=in.nextInt();
        int a[][]=new int[r][c];
        int s=0;
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
        /*for(int i = 0;i<r;i++)
        {
            s=0;
            for(int j=0;j<c;j++)
            {
                s=s+a[i][j];
            }
            System.out.println("Sum of row "+(i+1)+"= " + s);
        }*/
        System.out.println("=\t=\t=\t");
        for(int i = 0;i<c;i++)
        {
            s=0;
            for(int j=0;j<r;j++)
            {
                s=s+a[j][i];
            }
            System.out.print(s+"\t");            
        }
    }
}
import java.util.Scanner;
public class transpose
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int r=in.nextInt();
        System.out.print("Enter the number of columns :");
        int c=in.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[c][r];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter the element :");
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<c;i++)
        {
            for(int j=0;i<r;i++)
            {
                b[j][i]=a[i][j];
            }
        }
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(a[j][i]+"\t");
            }
            System.out.println();
        }
    }
}
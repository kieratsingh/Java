import java.util.Scanner;
public class matsum
{
    public static void main()    
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int r1=in.nextInt();
        System.out.print("Enter number of columns :");
        int c1=in.nextInt();
        System.out.print("Enter number of rows :");
        int r2=in.nextInt();
        System.out.print("Enter number of columns :");
        int c2=in.nextInt();
        int r,c;
        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int s[][] = new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print("Enter element:");
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print("Enter element:");
                b[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
        if(r1==r2 && c1==c2)
        {
            r=r1;
            c=c1;
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    s[i][j] = a[i][j]+b[i][j];
                }                
            }
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(s[i][j] + "\t");
                }
                System.out.println();
            }
        }
        else 
        {
            System.out.print("Sum is not possible");
        }
    }
}
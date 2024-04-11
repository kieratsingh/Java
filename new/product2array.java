import java.util.Scanner;
public class product2array
{
    public static void main()
    {
        int i,j,k,r,r1,r2,c,c1,c2;
        int m1[][] = new int[10][10];
        int m2[][] = new int[10][10];
        int m[][] = new int[10][10];
        Scanner in = new Scanner(System.in);
        System.out.println("For matrix 1 :");
        System.out.println("Enter the number of rows :");
        r1=in.nextInt();
        System.out.println("Enter the number of columns :");
        c1=in.nextInt();
        for(i = 0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print("Enter element of row-" + (i+1)+ " and column-" + (j+1) + ":");
                m1[i][j]=in.nextInt();
            }
        }
        System.out.println("For matrix 2 :");
        System.out.println("Enter the number of rows :");
        r2=in.nextInt();
        System.out.println("Enter the number of columns :");
        c2=in.nextInt();
        
        for(i = 0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print("Enter element of row-" + (i+1)+ " and column-" + (j+1) + ":");
                m2[i][j]=in.nextInt();
            }
        }
        System.out.print("\nFirst matrix is :\n");
        for(i = 0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print(m1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("\nSecond matrix is :\n");
        for(i = 0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(m2[i][j] + "\t");
            }
            System.out.println();

        }
        if(c1==r2)
        {
            r=r1;
            c=c2;
            System.out.print("\nProduct matrix is :\n");
            for(i = 0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    m[i][j]=0;
                    for(k = 0;k<r2;k++)
                    {
                        m[i][j]=m[i][j]+m1[i][k]*m2[k][j];
                    }                    
                }
            }
            System.out.print("\nProduct of both matrix is :\n");
            for(i = 0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    System.out.print(m[i][j] + "\t");
                }
                System.out.println();
            }
        }
        else 
        {
            System.out.print("Product is not possible :");
        }
    }
}
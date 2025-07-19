import java.util.Scanner;
public class mainandreard
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int r=in.nextInt();
        System.out.print("Enter the number of columns :");
        int c=in.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter element of row "+(i+1)+" column "+(j+1)+" :");
                a[i][j]=in.nextInt();
            }
        }
        if(r==c)
        {
            System.out.print("Main diagonal :\n");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(i==j)
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
            System.out.print("Rear diagonal :\n");
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(i+j==c-1)
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
        else
        {
            System.out.print("Array is not a square array :");
        }
    }
}
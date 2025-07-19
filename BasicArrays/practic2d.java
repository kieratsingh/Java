import java.util.Scanner;
public class practic2d
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int r=in.nextInt();
        System.out.print("Enter number of columns :");
        int c=in.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter element :");
                a[i][j]=in.nextInt(); 
            }
        }
        if(r==c)
        {
            System.out.print("Main Diagonal and Rear diagonal:\n");
            int s=0;
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(i==j || i+j==c-1)
                    {
                        System.out.print(a[i][j] + "\t");
                        s=s+a[i][j];
                    }
                    else
                    {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
            System.out.print("\nSum of maind and reard="+s);
        }
        else
        {
            System.out.print("Array isnt a square array :");
        }
    }

}
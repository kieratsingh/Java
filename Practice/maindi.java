import java.util.Scanner;
public class maindi
{
    public static void main()    
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int r=in.nextInt();
        System.out.print("Enter number of columns :");
        int c=in.nextInt();
        int a[][] = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print("Enter element:");
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
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
}
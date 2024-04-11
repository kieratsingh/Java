import java.util.Scanner;
public class specarr
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int so=0,se=0,r,c,i,j;
        System.out.print("Enter the number of rows :");
        r=in.nextInt();
        System.out.print("Enter the number of columns :");
        c=in.nextInt();
        int a[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print("Input element :");
                a[i][j]=in.nextInt();
                if(a[i][j]%2==0)
                {
                    se+=a[i][j];
                }
                else
                {
                    so+=a[i][j];
                }
            }
        }
        System.out.print("\nDisplaying array:\n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\s");
            }
            System.out.println();
        }
        System.out.println("\nSum of even ="+se);
        System.out.println("Sum of odd ="+so);
        if(so==se)
        {
            System.out.print("Array is a special array :");
        }
        else     
        System.out.print("Array is not a special array :");
    }
}
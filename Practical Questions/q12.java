import java.util.Scanner;
public class q12
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int m=in.nextInt();
        System.out.print("Enter the number of columns:");
        int n=in.nextInt();
        int a[][] = new int[m][n];
        int max=0,i,j;
        for(i=0;i<m;i++)//taking input of array
        {
            for(j=0;j<n;j++)
            {
                System.out.print("Enter the element of row "+(i+1)+" and column"+ (j+1));
                a[i][j]=in.nextInt();
            }            
        }
        max=a[0][0];
        for(i=0;i<m;i++)//finding largest element
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
                if(a[i][j]>max)
                {
                    max=a[i][j];
                }
            }   
            System.out.println();
        }
        System.out.println("Largest element ="+max);//printing largest 
    }
}

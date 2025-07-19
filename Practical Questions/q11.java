import java.util.Scanner;
public class q11
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int m=in.nextInt();
        System.out.print("Enter the number of columns:");
        int n=in.nextInt();
        int a[][] = new int[m][n];
        int count=0,i,j;
        for(i=0;i<m;i++)//taking input of elements
        {
            for(j=0;j<n;j++)
            {
                System.out.print("Enter the element of row "+(i+1)+" and column"+ (j+1));
                a[i][j]=in.nextInt();
                if(a[i][j]>=10 && a[i][j]<=99)
                {
                    count++;
                }
            }            
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }   
            System.out.println();
        }
        System.out.println("Number of 2 digit elements ="+count);//printing count
    }//end of void main
}
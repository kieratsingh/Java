import java.util.Scanner;
public class middleswap
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element :");
            a[i]=in.nextInt();
        }
        int m=(n%2==0)?n/2:(n+1)/2;
        for(int i=0;i<m;i++)
        {
            int temp=a[i];
            a[i]=a[i+m];
            a[i+m]=temp;
        }
        System.out.print("New array:\n");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}
import java.util.Scanner;
public class alternateswap
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the element :");
            a[i]=in.nextInt();
        }
        System.out.print("\nUnswapped array :\n");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
        for(int i=0;i<n-1;i+=2)
        {
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        System.out.print("\nSwapped array :\n");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}
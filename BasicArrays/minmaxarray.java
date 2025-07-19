import java.util.Scanner;
public class minmaxarray
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        int n=in.nextInt();
        int a[]=new int[n];
        int min=0,max=0,sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element "+(i+1)+" \n");
            a[i]=in.nextInt();
        }
        min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>=max)
            {
                max=a[i];
            }
            if(a[i]<=min)
            min=a[i];
            sum=sum+a[i];
        }
        System.out.println("min "+min);
        System.out.println("max "+max);
        System.out.println("sum "+sum);
    }
}
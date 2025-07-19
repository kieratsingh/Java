import java.util.Scanner;
public class sumoflastdig
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        int n=in.nextInt();
        int a[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element:");
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            s=s+a[i]%10;
        }
        System.out.print("Array :\n");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] + "\t");
        }
        System.out.print("Sum of last digit of all elements :" +s);
        int min=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]%10<min%10)
            {
                min=a[i];
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=0;
            while(a[i]>0)
            {
                sum=sum+a[i]%10;
                a[i]=a[i]/10;
            }
            a[i]=sum;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] + "\t");
        }
    }
}
import java.util.Scanner;
public class lastdigarrayandfirst
{
    public static void main()
    {
        int s=0,d=0,temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements :");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element:");
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] +"\t");
            s=s+(a[i]%10);
        }
        System.out.print("\nSum of last digits of all elements ="+s);
        int s1=0;
        for(int i=0;i<n;i++)
        {
            int num=a[i];
            while(num>0)
            {
                d=num%10;
                num=num/10;
            }
            s1=s1+d;
        }
        System.out.print("\nSum of first digits of all elements ="+s1);
    }
}
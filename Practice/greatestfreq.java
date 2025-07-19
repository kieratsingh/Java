import java.util.Scanner;
public class greatestfreq
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
        int max=0,maxf=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==max)
            {
                maxf++;
            }
        }
        System.out.print("Maximum number ="+max);
        System.out.print("\nFrequency of maximum number ="+maxf);
    }
}
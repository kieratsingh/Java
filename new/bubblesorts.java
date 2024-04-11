import java.util.Scanner;
public class bubblesorts
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
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]<a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}
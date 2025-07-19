import java.util.Scanner;
public class bubblesort
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements :");
        int n=in.nextInt();
        int a[] = new int[n];
        int temp=0;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element:");
            a[i]=in.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+"\t");
        }
    }
}
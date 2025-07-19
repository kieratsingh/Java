import java.util.Scanner;
public class averagearray
{
    public static void main()
    {
        System.out.print("Enter the number of elements:");
        Scanner in = new Scanner(System.in);
        int e = in.nextInt();
        int a[] = new int[e];
        double sum=0,avg;
        int i,j,t;
        for(i=0;i<e;i++)
        {
            System.out.print("Enter element "+(i+1)+":");
            a[i]=in.nextInt();
        }
        for(i=0;i<e;i++)
        {
            System.out.print(a[i] +"\n");
        }
        for(i=0;i<e;i++)
        {
            sum=sum+a[i];
        }
        avg=sum/e;
        System.out.print("Average of all elements =" +avg);
    }
}

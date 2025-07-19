//array
import java.util.Scanner;
public class array
{
    public static void main()
    {
        System.out.print("Enter the number of elements:");
        Scanner in = new Scanner(System.in);
        int e = in.nextInt();
        int a[] = new int[e];
        int pos=0;
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
        for(i=0,j=e-1;i<e/2;i++,j--)
        {
            t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        System.out.println("Reverse =");
        for(i=0;i<e;i++)
        {
            System.out.println(a[i]);
        }
    }
}

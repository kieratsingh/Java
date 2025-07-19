import java.util.Scanner;
public class arraysum
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int a[]=new int[10];
        int b[]=new int[5];
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter element :");
            a[i]=in.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            b[i]=a[2*i]+a[2*i+1];
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(b[i]+ "\t");
        }
    }
}
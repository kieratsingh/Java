import java.util.Scanner;
public class sampleq6
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        char a[] = new char[10];
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter element "+(i+1)+" :");
            a[i]=in.next().charAt(0);
        }
        int count=0;
        for(int i =0;i<10;i++)
        {
            if(a[i]>=65 && a[i]<=90)
            {
                count++;
            }
        }
        int temp = count;
        count=0;
        for(int i =0;i<10;i++)
        {
            if(a[i]=)
            {
                count++;
            }
        }
    }
}
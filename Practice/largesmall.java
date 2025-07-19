import java.util.Scanner;
public class largesmall
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int a[]= new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter "+(i+1)+" element");
            a[i]=in.nextInt();
        }
        int min=a[0],max=a[0];
        for(int i=0;i<10;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
            if(a[i]>max)
            max=a[i];
        }
        System.out.print("Largest number in array ="+max);
        System.out.print("\nSmallest number ="+min);
    }
}
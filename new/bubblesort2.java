import java.util.Scanner;
public class bubblesort2
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int a[] = new int[5]; 
        int temp;
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter the "+(i+1)+" element");
            a[i]=in.nextInt();
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.print("Sorted array =\n");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}
import java.util.Scanner;
public class bubblesortt
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n=5;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element "+(i+1));
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n-1-i;k++)
            {
                if(a[k]>a[k+1])
                {
                    int t=a[k];
                    a[k]=a[k+1];
                    a[k+1]=t;
                }                
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}
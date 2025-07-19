import java.util.Scanner;
public class q10
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int N=in.nextInt();
        int a[] = new int[N];
        int at[] = new int[N];
        int d,r,t;        
        for(int i=0;i<N;i++)//Taking input+digit finding
        {
            System.out.print("Enter the element "+(i+1)+" of the array:");
            a[i]=in.nextInt();
            r=0;
            t=a[i];
            while(t>0)
            {
                d=t%10;
                t=t/10;
                r=r*10+d;
            }
            at[i]=r;
        }
        for(int i=0;i<N;i++)//printing original
        {
            System.out.print(a[i]+"\t");
        }
        for(int i=0;i<N;i++)//printing selected
        {
            System.out.print(at[i]+"\t");
            if((i+1)%3==0)
            {
                System.out.println();
            }
        }

        
    }
}
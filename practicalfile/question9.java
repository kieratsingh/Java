import java.util.Scanner;
public class question9
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int N=in.nextInt();
        int a[] = new int[N];
        int fmax,smax;
        for(int i=0;i<N;i++)//taking input of elements
        {
            System.out.print("Enter the element "+(i+1)+" of the array:");
            a[i]=in.nextInt();
        }
        fmax=smax=a[0];
        for(int i=1;i<N;i++)//finding largest number 
        {
            if(a[i]>fmax)
            {
                fmax=a[i];
                
            }
            else if(a[i]<smax)
            {
                smax=a[i];
            }
        }
        System.out.print("Find largest number of the array ="+fmax);
        
    }//end of void main
}
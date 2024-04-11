import java.util.Scanner;
public class binary
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number to search for :");
        int n=in.nextInt();
        int a[]=new int[]{2,5,7,10,15,20,29,30,46,50};
        int low=a[0],mid;
        int pos,flag;
        int high=a[a.length-1];
        while(low<=high)
        {
            mid=(low+high)/2;
            if(a[mid]==n)
            {
                flag=1;
                pos=mid;
                break;
            }
            if(n>a[mid])
            {
                low=mid+1;
            }
            else if(n<a[mid])
            {
                high=mid-1;
            }
        }
        
    }
}

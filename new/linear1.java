import java.util.Scanner;
public class linear1
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array :");
        int n=in.nextInt();
        int a[] = new int[n];
        int flag=0,pos=1;
        int big=0,end=n-1,mid;
        
        for(int i = 0;i<n;i++)
        {
            System.out.print("Enter element :");
            a[i]=in.nextInt();
        }
        System.out.print("Enter the element to search for :");
        int n1=in.nextInt();
        while(big<end)
        {
            mid=(big+end)/2;
            if(a[mid]==n1)
            {
                pos=mid+1;
                flag=1;
                break;
            }
            else if(a[mid]<n1)
            {
                end=mid-1;
            }
            else if(a[mid]>n1)
            {
                big=mid+1;
            }
        }
        if(flag==1)
        {
            System.out.println("Search successful");
            System.out.println("Element found at position"+ pos);
        }
        else
        {
            System.out.print("Element not found");
        }
    }
}
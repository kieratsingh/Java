import java.util.Scanner;
public class deleteelement
{
    public static void main()
    {
        Scanner in =new Scanner(System.in);
        int n=10;
        int i;
        int a[] = new int[n];
        for(i=0;i<n;i++)
        {
            System.out.print("Enter element "+(i+1)+" :");
            a[i]=in.nextInt();
        }
        System.out.println("Array without deleting :");
        for(i=0;i<n;i++)
            {
                System.out.print(a[i]+"\t");
            }
        System.out.println("Enter position of element to delete :");
        int pos=in.nextInt();
        if(pos<=n && pos>=1)
        {
            for(i=pos-1;i<n-1;i++)
            {
                a[i]=a[i+1];
            }
            System.out.println("Array after deletion of element :");
            n=n-1;
            for(i=0;i<n;i++)
            {
                System.out.print(a[i]+"\t");
            }
        }
        else
        {
            System.out.print("Invalid position");
        }
        
    }
}
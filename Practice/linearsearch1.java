import java.util.Scanner;
public class linearsearch1
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int a[]=new int[10];
        int n=a.length;
        int flag=0;
        for(int i = 0;i<n;i++)
        {
            System.out.print("Enter element :");
            a[i]=in.nextInt();
        }
        System.out.print("Enter number to search for :");
        int n1=in.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==n1)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.print("success");
        }
        else
        {
            System.out.print("L");
        }
    }
}
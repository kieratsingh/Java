import java.util.Scanner;
public class pronicno
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=in.nextInt();
        int flag=0;
        for(int i=1;i<=n;i++)
        {
            if(i*(i+1)==n)
            {
                System.out.print("Its a pronic number :");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.print("Its not a pronic number :");
        }
    }
}
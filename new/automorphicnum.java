import java.util.Scanner;
public class automorphicnum
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=in.nextInt();
        int t=n*n,flag=0,s1=0,s2=0,i=1;
        while(t>0)
        {
            int d=t%10;
            s1=i*d;
            s2+=s1;
            if(s2==n)
            {
                flag=1;
                break;
            }
            t/=10;
            i*=10;
        }
        if(flag==1)
        {
            System.out.print("Number is an automorphic number");
        }
        else
        {
            System.out.print("Number is not an automorphic number");
        }
    }
}
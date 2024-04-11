import java.util.Scanner;
public class automorphic 
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int dn,dsq;
        boolean flag=false;
        System.out.print("Enter the number :");
        int n=in.nextInt();
        int sq=n*n;
        while (n>0)
        {
            dn=n%10;
            dsq=sq%10;
            if(dn==dsq)
            {
                flag=true; 
            }
            else
            {
                flag = false;
            }
            n=n/10;
            sq=sq/10;
        }
        if(flag==true)
        {
            System.out.print("Number is an automorphic number :");
        }
        else 
        {
            System.out.print("Number is not an automorphic number :");
        }
    }
}
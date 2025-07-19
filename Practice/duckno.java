import java.util.Scanner;
public class duckno
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=in.nextInt();
        int count=0,d,flag=0;
        while(n>0)
        {
            d=n%10;
            if(d==0)
            {
                flag=1;
            }
            n/=10;
            count++;
        }
        if(flag==1 && count==3)
        {
            System.out.print("Number is a duck number");
        }
        else
        System.out.print("Number is not a duck number :");
    }
}
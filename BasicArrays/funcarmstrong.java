import java.util.Scanner;
public class funcarmstrong
{
    int n,i;
    Scanner in = new Scanner(System.in);
    void checkArmstrong(int n)
    {
        int temp=n,sum=0,r;
        while(temp>0)
        {
            int d=temp%10;
            d=d*d*d;
            sum+=d;  
            temp=temp/10;
        }
        if(sum==n)
        {
            System.out.print("Number is armstrong ");
        }
        else
        {
            System.out.print("Number is not armstrong");
        }
    }
    void main()
    {
        System.out.print("Enter the number :");
        n=in.nextInt();
        checkArmstrong(n);        
    }
}
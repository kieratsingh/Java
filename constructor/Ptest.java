import java.util.*;
public class Ptest
{
    int n,flag;
    Scanner in = new Scanner(System.in);
    Ptest()
    {
        System.out.print("Enter number :");
        n=in.nextInt();
        flag=1;
    }
    int Primecheck()
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=0;
                break;
            }
        }
        return flag;
    }
    void main()
    {
        Ptest obj = new Ptest();
        if(obj.Primecheck()==1)
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.print("Number is not a prime number ");
        }
    }
}
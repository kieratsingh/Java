import java.util.*;
public class factorial
{
    int n,f,i;
    Scanner in = new Scanner(System.in);
    factorial()
    {
        System.out.print("Enter the number :");
        n=in.nextInt();
        f=1;
    }
    void factcheck()
    {
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.print("Factorial of "+n+" is "+f);
    }
    void main()
    {
        factorial obj=new factorial();
        obj.factcheck();
    }
}
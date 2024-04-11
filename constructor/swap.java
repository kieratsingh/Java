import java.util.*;
public class swap
{
    int n1,n2;
    Scanner in = new Scanner(System.in);
    swap()
    {
        System.out.print("Enter the first number :");
        n1=in.nextInt();
        System.out.print("Enter the second number :");
        n2=in.nextInt();
    }
    void swapper()
    {
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("After swapping :");
        System.out.println("n1 =" +n1);
        System.out.println("n2 =" +n2);
    }
    void main()
    {
        swap obj=new swap();
        obj.swapper();
    }
}
import java.util.Scanner;
public class ispalindrome
{
    Scanner in = new Scanner(System.in);
    boolean isPalindrome(int a)
    {
        int r=0;
        boolean t;
        int temp=a;
        while(temp>0)
        {
            int d=temp%10;
            r=(r*10)+d;
            temp/=10;
        }
        if(r==a)
        {
            t=true;
        }
        else
        {
            t=false;
        }
        return t;
    }
    void main()
    {
        System.out.println("Enter a number :");
        int a=in.nextInt();
        if(isPalindrome(a))
        {
            System.out.print("Number is a palindrome number");
        }
        else
        {
            System.out.print("Number is not a palindrome number");
        }
    }
}
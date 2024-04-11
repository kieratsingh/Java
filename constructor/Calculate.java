import java.util.Scanner;
public class Calculate
{
    Scanner in = new Scanner(System.in);
    int num,f,rev;
    Calculate(int n)
    {
        num=n;
        rev=0;
        f=0;
    }
    int prime()
    {
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                break;
            }
            else
            {
                f=1;
            }
        }
        return f;
    }
    int reverse()
    {
        while(num>0)
        {
            int d=num%10;
            rev=(rev*10)+d;
            num=num/10;
        }
        return rev;
    }
    void display()
    {
        if(num==rev)
        {
            System.out.print("Number "+num+" is a palindrome number");
        }
        else
        {
            System.out.print("Number "+num+" is a palindrome number");
        }
    }
}
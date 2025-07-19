import java.util.Scanner;
public class Converter
{
    int oct,deci;
    Scanner in = new Scanner(System.in);
    Converter()
    {
        oct=0;
        deci=0;
    }
    void getnum()
    {
        System.out.print("Enter the oct num :");
        oct=in.nextInt();
        int t=oct;
        int flag=0;
        while(t>0)
        {
            int d=t%10;
            if(d>=0 && d<8)
            {
                flag=0;
            }
            else 
            {
                flag=1;
                break;
            }            
        }
        if(flag==1)
        {
            System.out.print("Invalid input");
        }
    }
}
import java.util.Scanner;
public class Converter
{
    Scanner in = new Scanner(System.in);
    int oct,deci; 
    void getnum()
    {
        System.out.print("Enter octal number :");
        oct=in.nextInt();
        int temp=oct,d,flag=0;
        while(temp>0)
        {
            d=temp%10;
            if(d>7)
            {
                flag=0;
                System.exit(0);
            }
        }
        
    }
}
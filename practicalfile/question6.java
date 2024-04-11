import java.util.*;
public class question6
{
    int digitExtraction(int n)//extraction of digit1
    {
        int t=n;
        int d=n%10;
        return d;
    }
    int digitExtraction(int n, int P)//extraction of digit2
    {
        int d=0;
        for(int i=1;i<=P;i++)
        {
            d=n%10;
            n=n/10;
        }
        return d;
        
    }
    int digitExtraction(int n, char c)//extraction of digit3
    {
        int d=0;
        if(c=='L')
        {
            while(n!=0)
            {
                d=n%10;
                n=n/10;
            }
        }
        else if(c=='R')
        {
            d=n%10;
        }
        return d;
    }
    public void main()//to find the digits 
    {
        int d=0,P;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=in.nextInt();
        d=digitExtraction(n);
        System.out.println("Enter the digit number 0..1..2 :");
        P=in.nextInt();
        d=digitExtraction(n,P);
        System.out.print("Digit at P="+d);        
        System.out.print("\nEnter R or L:"); 
        char c=in.next().charAt(0);      
        d=digitExtraction(n,c);
        System.out.print("Rightmost/Leftmost digit ="+ d);
    }
}
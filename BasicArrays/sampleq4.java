import java.util.Scanner;
public class sampleq4
{
    Scanner in = new Scanner(System.in);
    void Add(int n,int d)
    {        
        System.out.print("Enter the number :");
        n=in.nextInt();
        System.out.print("Enter digit to add :");
        d=in.nextInt();
        int t=n,d1,count=0;
        for(int i=1;i<=t;i++)
        {
            d1=t%10;
            count=(d1==d)?count+1:count;
            t=t/10;            
        }
        System.out.print("Sum of all occurences of number ="+count*d);
    }
    void Add(int n)
    {
        System.out.print("Enter number :");
        n=in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                if(i%2!=0)
                {
                   sum=sum+i; 
                }
            }
        }
        System.out.print("Sum ="+sum);
    }
    void Add(double n,double d)
    {
        int n1,d1,n2,d2;
        System.out.print("Enter n :");
        n=in.nextDouble();
        System.out.print("Enter d :");
        d=in.nextDouble();
        n1=(int) n;
        d1=(int) d;
        int sum=n1+d1;
        System.out.print("Sum ="+sum);        
    }
}
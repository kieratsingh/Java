import java.util.Scanner;
public class printoverload
{
    void print()
    {
        int k=1;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+"\s");
                k++;
            }
            System.out.println();
        }
    }
    boolean print(int n)
    {
        int s=0,d;
        int t=n;
        while(n>0)
        {
            d=n%10;
            s+=d;
            n=n/10;
        }
        boolean a=(s==t)?true:false;
        return a; 
    }
    void print(int a,char ch)
    {
        switch(ch)
        {
            case 's':
            case 'S':
                System.out.print(a*a);
                break;
            case 'c':
            case 'C':
                System.out.print(a*a*a);
                break;
            default:
                System.out.print("Invalid input :");
        }
    }
    void main()
    {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        char ch=in.next().charAt(0);
        print(a,ch);
    }
}
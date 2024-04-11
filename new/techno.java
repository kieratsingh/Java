import java.util.Scanner;
public class techno
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n,c=0,l;
        System.out.println("Enter the number :");
        n=in.nextInt();
        int t=n;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        if(c%2==0)
        {
            int fh,sh;
            int y=c/2;
            int p=1;
            for(int i=1;i<=y;i++)
            {
                p=p*10;;
            }
            fh=t/p;
            sh=t%p;
            l=(fh+sh)*(fh+sh);
            if(l==t)
            {
                System.out.print("Number is a tech number");
            }
            else
            {
                System.out.print("Number is not a tech number");
            }
        }
        else{
            System.out.print("Number is not a tech number");
        }
    }
}
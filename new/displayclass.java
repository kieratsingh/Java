import java.util.Scanner;
public class displayclass
{
    Scanner in = new Scanner(System.in);
    void display()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
    void display(int n)
    {
        int temp,d;
        double s;
        temp=n;
        while(temp>0)
        {
            d=temp%10;
            s=Math.sqrt(d);
            System.out.println("Digit "+ d+" square root ="+ s);
            temp/=10;
        }
    }
    void main()
    {
        displayclass obj = new displayclass();
        System.out.print("Enter N for the sqrt program :");
        int n;
        n=in.nextInt();
        obj.display(n);
        obj.display();
    }
}
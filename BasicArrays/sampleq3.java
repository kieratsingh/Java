import java.util.Scanner;
public class sampleq3
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Choices are :\n1. Term Deposit\n2. Recurring Deposit");
        System.out.println("Enter your choice :");
        int choice =in.nextInt();
        int p,r,n;
        double a;
        switch(choice)
        {
            case 1:
                System.out.print("Enter the principal ammount :");
                p=in.nextInt();
                System.out.print("Enter the rate :");
                r=in.nextInt();
                System.out.print("Enter the time period :");
                n=in.nextInt();
                a=p*(Math.pow((1+r/100),n));
                System.out.print("Maturity value ="+a);
                break;
            case 2:
                System.out.print("Enter the Monthly Installment :");
                p=in.nextInt();
                System.out.print("Enter the rate :");
                r=in.nextInt();
                System.out.print("Enter the time period :");
                n=in.nextInt();
                a=p*n+p*(n*(n+1)/2)*r/100*r/12;
                System.out.print("Maturity value ="+a);
                break;
            default:
                System.out.print("Invalid input :");
                
        }
    }
}
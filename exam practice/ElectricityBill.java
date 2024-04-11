import java.util.Scanner;
public class ElectricityBill
{
    String n;
    int units;
    double bill;
    Scanner in = new Scanner(System.in);
    void accept()
    {
        System.out.print("Enter the name of the customer :");
        n=in.nextLine();
        System.out.print("Enter the units consumed by the customer :");
        units = in.nextInt();
    }
    void calculate()
    {
        if(units<=100)
        {
            bill=units * 2.0;
        }
        else if(units>100 && units<=300)
        {
            bill=100*2.0+(units-100)*3.0;
        }
        else if(units>300)
        {
            bill=(units-300)*5.0+(200*3.0)+(100*2.0)+(units*(25/1000));
        }
        else
        {
            bill=0;
        }
    }
    void print()
    {
        System.out.println("Name of customer : "+n);
        System.out.println("Number of units : "+units);
        System.out.println("Total bill :"+bill);
    }
    public void main()
    {
        accept();
        calculate();
        print();
    }
}
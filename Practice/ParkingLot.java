import java.util.Scanner;
public class ParkingLot
{
    Scanner in = new Scanner(System.in);
    int vno,hours;
    double bill;
    void input()
    {
        System.out.print("Enter the vehicle number :");
        vno=in.nextInt();
        System.out.print("Enter the number of hours of parking :");
        hours =in.nextInt();
    }
    void calculate()
    {
        if(hours>=1)
        bill=((hours-1)*1.5)+3;
        else
        bill=0;
    }
    void display()
    {
        System.out.print("Total cost ="+bill);
    }
    void main()
    {
        ParkingLot obj=new ParkingLot();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
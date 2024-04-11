import java.util.Scanner;
public class Booking
{
    String Name,Type_of_booking,Type_of_seat;
    double ticket_price;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name");
        Name=sc.next();
        System.out.print("Enter type of seat");
        Type_of_seat=sc.next();
        System.out.print("Enter type of booking");
        Type_of_booking=sc.nextLine();
    }

    void calculate()
    {
        if(Type_of_seat.equalsIgnoreCase("Ordinary"))
            ticket_price=2500;
        else if(Type_of_seat.equals("Pavillion"))
            ticket_price=3500;
        else if(Type_of_seat.equals("Commentary Box"))
            ticket_price=6000;
        else
            ticket_price=8000;

        if(Type_of_booking.equals("online"))
            ticket_price=ticket_price-(ticket_price*0.10);
        else if(Type_of_booking.equals("advance booking"))
            ticket_price=ticket_price-(ticket_price*0.8);
    }

    void display()
    {
        System.out.println("Name - "+Name);
        System.out.println("Type of Seat -"+Type_of_seat);
        System.out.println("Type of Booking -"+Type_of_booking);
        System.out.println("Ticket price -"+ticket_price);
    }

    public static void main()
    {
        Booking b1=new Booking();
        b1.accept();
        b1.calculate();
        b1.display();
    }
}
import java.util.Scanner;
public class Laptop
{
    private String name;
    private int price;
    private double dis;
    private double amt;
    Scanner in= new Scanner(System.in);
    public Laptop(String s, int p)
    {
        name = s;
        price = p;
    }
    public Laptop()
    {
        name = "";
        price = 0;
    }
    public Laptop(int p){
        System.out.print("Enter the name :");
        name=in.nextLine();
        price=p;
    }
    public void input()
    {
        System.out.print("Enter the name :");
        String name=in.nextLine();
    }

    public void compute() {
        if (price <= 25000)
            dis = price * 0.05;
        else if (price <= 50000)
            dis = price * 0.075;
        else if (price <= 100000)
            dis = price * 0.1;
        else
            dis = price * 0.15;

        amt = price - dis;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Discount: " + dis);
        System.out.println("Amount to be paid: " + amt);
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String str = in.nextLine();
        System.out.print("Enter Price: ");
        int p = in.nextInt();

        Laptop obj = new Laptop(str,p);
        obj.compute();
        obj.display();
        Laptop obj1 = new Laptop();
        obj1.input();
        obj1.compute();
        obj1.display();
        Laptop obj2 = new Laptop(p);
        obj2.compute();
        obj2.display();
    }
}
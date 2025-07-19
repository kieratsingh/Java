import java.util.*;
public class ShowRoom
{
    String name;
    long mobno;
    double cost,dis,amount;
    ShowRoom()
    {
        name="";
        mobno=0;
        dis=0;
        amount=0;
    }
    Scanner in = new Scanner(System.in);
    void input()
    {
        System.out.print("Enter the following details respectfully :\nname, mobile number, cost");
        name=in.nextLine();
        mobno=in.nextLong();
        cost=in.nextDouble();
    }
    void calc()
    {
        if(cost>35000)
        {
            dis=0.2;
        }
        else if(cost>20000)
        {
            dis=0.15;
        }
        else if(cost>10000)
        {
            dis=0.1;
        }
        else 
        {
            dis=0.05;
        }
        amount=cost-(cost*dis);
    }
    void display()
    {
        System.out.print("Customer name : "+name);
        System.out.print("Mobile number : "+mobno);
        System.out.print("Amount : "+amount);
    }
    void main()
    {
        input();
        calc();
        display();
    }
}
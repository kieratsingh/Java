import java.util.Scanner;
public class Student 
{
    String name,stream;
    int age,mks;
    Scanner in = new Scanner(System.in);
    void accept()
    {
        System.out.print("Enter user name :");
        name=in.nextLine();
        System.out.print("Enter user age :");
        age=in.nextInt();
        System.out.print("Enter user marks :");
        mks=in.nextInt();
    }
    void allocation()
    {
        if(mks>=300)
        {
            stream = "Science and Computer";
        }
        else if(mks>=200)
        {
            stream = "Commerce and Computer";
        }
        else if(mks>=75)
        {
            stream = "Arts and Animation";
        }
        else 
        {
            stream="Try again";
        }
    }
    void print()
    {
        System.out.println("Student name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Marks :"+ mks);
        System.out.println("Stream :"+stream);
    }
    void main()
    {
        Student obj = new Student();
        obj.accept();
        obj.allocation();
        obj.print();
    }
}
import java.util.Scanner;
public class Student
{
    String name,stream;
    int age,marks;
    Scanner in = new Scanner(System.in);
    void accept()
    {
        System.out.print("Enter name :");
        name=in.nextLine();
        System.out.print("Enter age :");
        age=in.nextInt();
        System.out.print("Enter marks :");
        marks=in.nextInt();
    }
    void allocation()
    {
        if(marks>=300)
        {
            stream = "Science and Computer";
        }
        else if(marks>=200)
        {
            stream = "Commerce and Computer";
        }
        else if(marks>=75)
        {
            stream = "Arts and animations";
        }
        else
        {
            stream = "Try again";
        }
    }
    void print()
    {
        System.out.println("Name of student :"+name);
        System.out.println("Age of student :"+age);
        System.out.println("Marks of student :"+marks);
        System.out.println("Stream assigned :"+stream);
    }
    void main()
    {
        Student obj = new Student();
        obj.accept();
        obj.allocation();
        obj.print();
    }
}
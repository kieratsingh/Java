import java.util.Scanner;
public class IMDB
{
    Scanner in = new Scanner(System.in);
    int year;
    float rating;
    String title;
    IMDB()
    {
        year=0;
        title="";
        rating=0;
    }
    void accept()
    {
        System.out.print("Enter the year of release of the film :");
        year=in.nextInt();
        System.out.print("Enter the title of the film :");
        title=in.nextLine();
        System.out.print("Enter the rating of the film :");
        rating=in.nextFloat();
    }
    void display()
    {
        String comm="";
        if(rating>0 && rating<=2)
        {
            comm="flop";
        }
        else if(rating>2 && rating<=3.5)
        {
            comm="Semi-hit";
        }
        else if(rating>3.5 && rating<=4.5)
        {
            comm="hit";
        }
        else if(rating>4.5 && rating<=5)
        {
            comm="Super hit";
        }
        System.out.print("Movie:\n"+title+" - "+comm);
    }
    void main()
    {
        IMDB obj=new IMDB();
        obj.accept();
        obj.display();
    }
}
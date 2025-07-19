import java.util.Scanner;
public class stringsearch
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        boolean flag=false;
        String temp="";
        String wonders[] = {"CHICHEN ITZA", "CHRIST THE REDEEMER", "TAJ MAHAL", 
                "GREAT WALL OF CHINA", "MACHU PICCHU", "PETRA", "COLOSSEUM"};
        String location[] = {"MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN", "ITALY"};
        System.out.print("Enter the name of country:");
        String country=in.next();
        for(int i=0;i<wonders.length;i++)
        {
            if(country.equalsIgnoreCase(location[i]))
            {
                flag=true;
                temp=wonders[i];
            }
        }
        if(flag==true)
        {
            System.out.print(temp);
        }
        else
        {
            System.out.print("Sorry not found!");
        }
    }
}
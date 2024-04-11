import java.util.Scanner;
public class menuprint
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the choice either \"Pattern\" or \"Unicode\" :");
        String choice = in.next();
        switch(choice)
        {
            case "Pattern":
                for(int i=1;i<=5;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }
                break;
            case "Unicode":
                for(int i=65;i<=90;i++)
                {
                    char c= (char)i;
                    System.out.println("Character "+c+" - Unicode - "+i);
                }
                break;
            default:
                System.out.print("Invalid input :");
        }
    }
}
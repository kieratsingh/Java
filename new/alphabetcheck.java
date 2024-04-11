import java.util.Scanner;
public class alphabetcheck
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character :");
        char ch=in.next().charAt(0);       
        if(Character.isLetter(ch))
        {
            if(Character.isUpperCase(ch))
            {
                System.out.print("Character is uppercase ");
            }
            else
            {
                System.out.print("Character is lowercase :");
            }
        }
        else
        {
            System.out.print("Character is not a letter");
        }
    }
}
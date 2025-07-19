import java.util.Scanner;
public class asciichar
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s=in.nextLine();
        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i) + "----->" + (int)s.charAt(i));
        }
    }
    String in= in.nextInt();
}
import java.util.Scanner;
public class stringreverse
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string :");
        String s=in.next();
         r="";
        for(int i=s.length();i>=0;i--)
        {
            r=s.charAt(i);
        }
        
    }
}
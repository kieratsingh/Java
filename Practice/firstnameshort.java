import java.util.Scanner;
public class firstnameshort
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name :");
        String s=in.nextLine();
        String ts="";
        ts=s.charAt(0)+".";
        int p=s.indexOf(' ');
        ts=ts+s.substring(p);
        System.out.print(ts);
    }
}
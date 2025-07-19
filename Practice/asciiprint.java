import java.util.Scanner;
public class asciiprint
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name :");
        String s=in.next();
        for(int i=0;i<s.length();i++)
        {
            System.out.print("\nAscii value of letter :"+s.charAt(i)+"is =");
            int x=(int) s.charAt(i);
            System.out.print(x);
        }
    }
}
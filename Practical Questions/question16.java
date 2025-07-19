import java.util.Scanner;
public class question16
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=in.nextLine();
        String t="";
        char alt;
        for(int i=0;i<s.length();i++)//loop tillthe final character of the string
        {
            if(s.charAt(i)>=97 && s.charAt(i)<=122)
            {
                int n=s.charAt(i)-32;
                t=t+(char)n;//type conversion
            }
            else
            {
                t=t+s.charAt(i);
            }
        }
        System.out.print("All uppercase :" + t);
    }
}
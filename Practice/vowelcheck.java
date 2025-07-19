import java.util.Scanner;
public class vowelcheck
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string :");
        String s=in.next();
        int pos=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                pos=i+1;
                break;
            }
        }
        if(pos==0)
        {
            System.out.print("no vowel");
        }
        else
        {
            System.out.print("Vowel found at :"+pos);
        }
    }
}
import java.util.Scanner;
public class uppercasevowel
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string :");
        String s=in.nextLine();
        s=s.toUpperCase();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I'|| s.charAt(i)=='O' || s.charAt(i)=='U')
            count++;
        }
        System.out.print("\n In string -"+s+" Number of vowels = "+count);
        
        
    }
}
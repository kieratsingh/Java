import java.util.Scanner;
public class reversestr
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        String s,r="";
        System.out.print("Enter the string :");
        s=in.nextLine();
        for(int i=s.length()-1;i>=0;i--)
        {
            r+=s.charAt(i);
        }
        System.out.print("String reverse :\n"+r);
        if(r.equals(s))
        System.out.print("Number is palindrome ");
    }
}
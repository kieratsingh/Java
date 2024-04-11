import java.util.Scanner;
public class palindromeword
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word :");
        String s=in.nextLine();
        String r="";
        for(int i=s.length()-1;i>=0;i--)
        {
            r=r+s.charAt(i);
        }
        if(r.compareTo(s)==0)
        {
            System.out.print("Word is a palindrome word");
        }
        else
        {
            System.out.print("Word isnt a palindrome word");
        }
    }
}
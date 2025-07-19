import java.util.Scanner;
public class question15
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter sentence :");
        String s=in.nextLine();
        int sc=0,nc=0,lc=0,c=0;
        s=s.toLowerCase();
        System.out.print(s);
        for(int i=0;i<s.length();i++)//Loop to chem char
        {
            if(s.charAt(i)>=97 && s.charAt(i)<=122)//condition for lowercase
            {
                lc++;
            }
            else if(s.charAt(i)>=48 && s.charAt(i)<=57)//condition for digits
            {
                nc++;
            }
            else if(s.charAt(i)==' ')
            {
                c++;
            }
            else
            {
                sc++;
            }
        }
        System.out.print("Number of alphabets :" +lc);
        System.out.print("\nNumber of number :" + nc);
        System.out.print("\nNumber of Spaces :" +c);
        System.out.print("\nNumber of special characters :" +sc);
    }
}
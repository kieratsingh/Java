import java.util.Scanner;
//input and print characters in reverse order 
public class question17
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s=in.nextLine();
        String r="";
        System.out.print("String in normal order :\t"+s);
        for(int i=s.length()-1;i>=0;i--)//loop from length till last char
        {
            r=r+s.charAt(i);
        }
        System.out.print("String in reverse order :\n" + r);
    }//end of void main
}
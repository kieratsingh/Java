import java.util.Scanner;
public class stringq
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string :");
        String str=in.nextLine();
        String c="";
        for(int i=0;i<str.length();i++)
        {
            if(i==0 || str.charAt(i-1)==' ')
            {
                c=c+Character.toUpperCase(str.charAt(i));
            }
            else{
                c=c+str.charAt(i);
            }
        }
        System.out.print("String after change :\n"+c);
    }
}
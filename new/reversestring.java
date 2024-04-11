import java.util.Scanner;
public class reversestring
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name :");
        String s=in.nextLine();
        for(int i=s.length()-1;i>=0;i--)
            System.out.print(s.charAt(i));
}
import java.util.Scanner;
public class charfreq
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter word :");
        String str = in.nextLine();
        str=str.toUpperCase();
        for(int i=65;i<=90;i++)
        {
            char ch=(char)i;
            int count=0;
            for(int j=0;j<str.length();j++)
            {
                if(ch==str.charAt(j))
                {
                    count++;
                }
            }
            System.out.println("Occurence of "+ch+" in"+str+" = "+count); 
        }
    }
}
import java.util.Scanner;
public class question14
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        String s[]=new String[10];
        for(int i=0;i<10;i++)//taking input of name 
        {
            System.out.println("Enter name" + (i+1));
            s[i]=in.nextLine();
        }
        int length=s[0].length();
        for(int i=0;i<10;i++)//checking higher length 
        {
            if(s[i].length()>length)
            {
                length=s[i].length();
            }
        }
        System.out.print("Longest word/words:");
        for(int i=0;i<10;i++)//prining the longest word 
        {
            if(s[i].length()==length)
            {
                System.out.println(s[i]);
            }
        }
    }
}
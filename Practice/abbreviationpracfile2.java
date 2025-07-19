import java.util.Scanner;
public class abbreviationpracfile2
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter sentence");
        String s = in.nextLine();  
        String as ="";
        as=as+s.charAt(0)+'.';
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                as=as+s.charAt(i+1)+'.';
            }
        }  
        System.out.print("Abbreviation =" +as);
        /*String tempchar=" ";
        if(s.startsWith(" "))
        {
        for(int i=0;i<s.length();i++)
        {
        if(s.charAt(i)==' ')
        {
        tempchar=tempchar+s.charAt(i+1);
        }
        }
        }
        else
        {
        tempchar=tempchar+s.charAt(0);
        for(int i=0;i<s.length();i++)
        {
        if(s.charAt(i)==' ')
        {
        tempchar=tempchar+s.charAt(i+1);
        }
        }
        }
        System.out.print("Abbreviation =" +tempchar);
         */
    }
}
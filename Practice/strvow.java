import java.util.Scanner;
public class strvow 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = in.nextLine();
        s=' '+s;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== ' ')
            {
                if(s.charAt(i+1)=='a' || s.charAt(i+1) == 'e' || s.charAt(i+1) == 'i' || s.charAt(i+1) == 'o' || s.charAt(i+1) == 'u')
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
import java.util.Scanner;
public class vowelstar
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        String b="";
        System.out.println("Enter the sentence :");
        String a=in.nextLine();
        for(int i=0;i<a.length()-1;i++)
        {
            char ch=a.charAt(i);
            if(a.charAt(i)=='a' || a.charAt(i)=='o' || a.charAt(i)=='i' || a.charAt(i)=='e' || a.charAt(i)=='u')  
            {
                b=b+'*';
            }
            else 
            {
                b=b+ch;
            }
        }   
    }
}
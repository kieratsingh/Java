import java.util.Scanner;
public class strcasedigspe
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sentence :");
        String s=in.nextLine();
        int nd=0,ns=0,uc=0,lc=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                uc++;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                lc++;
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                nd++;
            }
            else
            {
                ns++;
            }
        }
        System.out.println("Number of uppercase characters ="+uc);
        System.out.println("Number of lowercase characters =" +lc);
        System.out.println("Number of digits ="+ nd);
        System.out.println("Number of special characters ="+ns);
    }
}
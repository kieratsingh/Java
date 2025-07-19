import java.util.Scanner;
public class fupperlower
{
    Scanner in = new Scanner(System.in);
    public void main()
    {
        char ch;
        int u=0,l=0;
        for(int i=1;i<=10;i++)
        {
            System.out.print("Enter a character :");
            ch=in.next().charAt(0);
            if(Character.isUpperCase(ch))
            {
                u++;
            }
            else if(Character.isLowerCase(ch))
            {
                l++;
            }
        }
        System.out.print("Number of uppercase characters ="+u+"\nNumber of lowercase characters ="+l);
    }
}
import java.util.*;
public class Arrange
{
    Scanner in = new Scanner("System.in");
    String str,i;
    int p;
    char ch;
    Arrange(String s)
    {
        str=s;
        i="";
        p=s.length();
        ch=' ';
    }
    void rearrange()
    {
        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<=p;j++)
            {
                ch=str.charAt(j);
                if(i==Character.toUpperCase(ch))
                {
                    i=i+ch;
                }
            }
        }
    }
    void display()
    {
        System.out.print("Rearranged word :"+i);
    }
    void main()
    {
        System.out.print("Enter the word :");
        String s=in.next();
        Arrange obj=new Arrange(s);
        obj.rearrange();
        obj.display();
    }
}
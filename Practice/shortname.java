import java.util.Scanner;
public class shortname
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the full name :");
        String s=in.nextLine();
        s=s.trim();        
        int x,y=s.lastIndexOf(' ');
        String str = s.substring(y+1);
        String same,sname="";
        same=s.substring(0,y);
        for(int i=0;i<same.length();i++)
        {
            if(i==0 || same.charAt(i-1)==' ')
            {
               sname+=s.charAt(i)+'.'; 
            }
        }
        sname+=str;
        System.out.print(sname);
    }
}
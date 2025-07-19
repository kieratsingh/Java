import java.util.Scanner;
public class linear
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        String name[]=new String[5];
        long t[]=new long[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter name of user followed by their telephone number :");
            name[i]=in.next();
            t[i]=in.nextInt();
        }
        System.out.print("Enter name of user to search :");
        String namesearch=in.next();
        int flag=0;
        for(int i=0;i<5;i++)
        {
            if(name[i].equals(namesearch))
            {
                System.out.print(t[i]);
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.print("Search unsuccessful");
        }
    }
}
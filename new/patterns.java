import java.util.Scanner;
public class patterns
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter choice of pattern(1 or 2) :");
        int c=in.nextInt();
        switch(c)
        {
            case 1:
                for(int i=69;i>=65;i--)
                {
                    for(int j=65;j<=i;j++)
                    {
                        System.out.print((char)j);
                    }
                    System.out.println();
                }
                break;
            case 2:
                String s="BLUE";
                for(int i=0;i<s.length();i++)
                {
                    for(int j=0;j<=i;j++)
                    {
                        System.out.print(s.charAt(i));
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.print("Invalid choice");
        }
    }
}
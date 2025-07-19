import java.util.Scanner;
public class wuauio
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n,c;
        System.out.print("Enter choice :");
        c=in.nextInt();
        switch(c)
        {
            case 1:
                for(int i=65;i<=90;i++)
                {
                    System.out.println((char)i+"\t"+i);
                }
                break;
            case 2:
                for(int i=1;i<=5;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(j+"\s");
                    }
                    System.out.println();
                }
                break;
        }
    }
}
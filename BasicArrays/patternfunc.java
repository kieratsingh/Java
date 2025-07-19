import java.util.Scanner;
public class patternfunc
{
    void pattern1(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2!=0)
                {
                   System.out.print("*");
                }
                else
                {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
    public void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n:");
        int n=in.nextInt();
        pattern1(n);        
    }
}
import java.util.Scanner;
public class sieriessum
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your choice (1 or 2):");
        int c=in.nextInt();
        int s=0;
        switch(c)
        {
            case 1:
                System.out.print("Enter x:");
                int x=in.nextInt();
                for(int i=1;i<=3;i++)
                {
                    if(i%2==0)
                    {
                        s-=Math.pow(x,i);
                    }
                    else
                    {
                        s+=Math.pow(x,i);
                    }                    
                }
                System.out.print("Sum of series ="+s);
                break;
            case 2:
                for(int i=1;i<=5;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(1);
                    }
                    System.out.print("\s");
                }
        }
        
    }
}
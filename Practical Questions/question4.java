import java.util.*;
public class question4
{
    void printPattern_1(int n)//to  print a pattern
    {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
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
    public void main()// to call the function
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N:");
        int n=in.nextInt();
        printPattern_1(n);
    }//end of void main
}

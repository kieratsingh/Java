import java.util.Scanner;
public class marksinc
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students:");
        int s=in.nextInt();
        System.out.print("Enter number of subjects:");
        int sub=in.nextInt();
        int a[][]=new int[s][sub];
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<sub;j++)
            {
                System.out.print("Enter element :");
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<sub;j++)
            {
                if(a[i][j]<35 && a[i][j]>30)
                {
                    a[i][j]=35;
                }
            }
        }
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<sub;j++)
            {
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
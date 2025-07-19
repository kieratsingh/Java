import java.util.Scanner;
public class combination
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int Q[] = new int[4];
        int P[] = new int[6];
        int r[] = new int[10];
        for(int i=0;i<6;i++)
        {
            System.out.print("Enter element of P :");
            P[i]=in.nextInt();
        }
        for(int i=0;i<4;i++)
        {
            System.out.print("Enter element of q :");
            Q[i]=in.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            if(i<6)
            {
                r[i]=P[i];
            }
            else
            r[i]=Q[i-6];
            
        }
        System.out.print("Final combined array :");
        for(int i=0;i<10;i++)
        {
            System.out.print(r[i]+"\t");
        }
    }
}
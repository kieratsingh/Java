import java.util.*;
public class q1
{
    double s;
    int x,N;
    double sumSeries(int x, int N)//Function to find the series
    {
        int i;
        s=0;
        for(i=1;i<=N;i++)//loop to run series
        {
            s=s+Math.pow (2,x+1-i)/i;
        }        
        return s;
    }
    public void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of x:");
        x=in.nextInt();
        System.out.print("Enter the value of N:");
        N=in.nextInt();
        s=s+sumSeries(x,N);
        System.out.print("Sum of series ="+ s);
    }//end of void main
}
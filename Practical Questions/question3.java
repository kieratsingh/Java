import java.util.*;
public class question3
{
    double s;
    int N;
    double sumSeries(int N)//sum of series
    {
        int i;
        s=0;
        for(i=1;i<=N;i++)
        {
            if(i%2==0)
            {
                s=s-2*i;
            }
            else 
            {
                s=s+2*i;
            }
        }        
        return s;
    }
    public void main()//to take input and call the sum function
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N:");
        N=in.nextInt();
        s=s+sumSeries(N);
        System.out.print("Sum of series ="+ s);
    }//end of void main
}

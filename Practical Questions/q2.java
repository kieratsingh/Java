import java.util.*;
public class q2
{
    double s;
    int a,N;
    double sumSeries(int a, int N)//to find the sum of series 
    {
        int i;
        s=0;
        double f=1;
        for(i=1;i<=N;i++)
        {
            f=f*i; 
            s=s+Math.pow(a,i)/f;
        }        
        return s;
    }
    public void main()//to take inpiut and call function 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a=in.nextInt();
        System.out.print("Enter the value of N:");
        N=in.nextInt();
        s=s+sumSeries(a,N);
        System.out.print("Sum of series ="+ s);
    }//end of void main
}

import java.util.*;
public class question5
{
    double s;
    int n;
    void floyd_triangle(int n)//functio to print the figure
    {
        int i,j;
        for (i=1; i<=n;i++) 
        {
            for (j=1;j<=i;j++) 
            {
                System.out.print(j);
                j++;
            }   
            System.out.println();
        }
    }
    public void main()//to call the function
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of N:");
        n=in.nextInt();
        floyd_triangle(n);
    }//end of void main
}

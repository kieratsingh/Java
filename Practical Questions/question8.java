import java.util.Scanner;
public class question8
{
    public static void main()
    {
        double height[]=new double[10];
        double average, max,min,t=0;
        int i;
        Scanner in=new Scanner(System.in);
        for(i=0;i<10;i++)//to find var used to find average
        {
            System.out.println("Enter the height of "+(i+1)+" element:");
            height[i]=in.nextDouble();
            t=t+height[i];
        }
        average=t/10;
        max=min=height[0];
        for(i=1;i<10;i++)//if min or max
        {
            if(height[i]>max)
            {
                max=height[i];
            }
            if(height[i]<min)
            {
                min=height[i];
            }
        }
        System.out.print("Average height ="+ average);
        System.out.print("Maximum height = "+max);
        System.out.print("Minimum height = "+min);
               
    }//end of void main
}
import java.util.Scanner;
public class coordinates
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int x1,x2,y1,y2;
        double dis;
        System.out.print("Enter coordinates of first point(x1,y1) respectively  :");
        x1=in.nextInt();
        y1=in.nextInt();
        System.out.print("Enter coordinates of second point(x2,y2) respectively  :");
        x2=in.nextInt();
        y2=in.nextInt();
        dis=Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2));
        System.out.print("Distance between the 2 points ="+ dis);
    }
}
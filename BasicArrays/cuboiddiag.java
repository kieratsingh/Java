import java.util.Scanner;
public class cuboiddiag
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int l,b,h;
        double d;
        System.out.print("Enter the length :");
        l=in.nextInt();
        System.out.print("Enter the breadth :");
        b=in.nextInt();
        System.out.print("Enter the height :");
        h=in.nextInt();
        d=Math.sqrt((Math.pow(l,2))+(Math.pow(b,2))+(Math.pow(h,2)));
        System.out.print("diagonal of cuboid ="+ d);
    }
}
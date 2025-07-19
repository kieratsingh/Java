import java.util.Scanner;
public class volume
{
    double v;
    Scanner in = new Scanner(System.in);
    double volume(double R)
    {
        v=(4.0/3.0)*(22.0/7.0)*Math.pow(R,3);
        return v;
    }
    double volume(double R,double H)
    {
        v=(22.0/7)*R*R*H;
        return v;
    }
    double volume(double L,double B,double H)
    {
        v=L*B*H;
        return v;
    }
    void main()
    {
        System.out.print("Volume of sphere :"+volume(3));
        System.out.print("Volume of Cylinder :"+volume(3,5));
        System.out.print("Volume of cube :"+volume(3,5,7));
    }
}
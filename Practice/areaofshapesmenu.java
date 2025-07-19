import java.util.Scanner;
public class areaofshapesmenu
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Menu :\n1- Area of Right Triangle\n2- Area of Equilateral Triangle\n3- Area of Square\n4- Area of Rectangle\n5- Area of Circle\n");

        System.out.print("Enter choice :");
        int choice=in.nextInt();
        double area;
        
        switch(choice)
        {
            case 1:
                System.out.print("Enter height :");
                int h=in.nextInt();
                System.out.print("Enter base :");
                int b=in.nextInt();
                area=(1/2)*b*h;
                System.out.print("Area ="+area);
                break;
            case 2:
                System.out.print("Enter side :");
                int s=in.nextInt();
                area=(Math.sqrt(3)/4)*s*s;
                System.out.print("Area ="+area);
                break;
            case 3:
                System.out.print("Enter side :");
                s=in.nextInt();
                area=s*s;
                System.out.print("Area ="+area);
                break;
            case 4:
                System.out.print("Enter length :");
                int l=in.nextInt();
                System.out.print("Enter breadth :");
                b=in.nextInt();
                area=l*b;
                System.out.print("Area ="+area);
                break;
            case 5:
                System.out.print("Enter radius :");
                int r=in.nextInt();
                area=3.142*r*r;
                System.out.print("Area ="+area);
                break;
            default:
                System.out.print("Invalid input");
                
        }
        
    }
}
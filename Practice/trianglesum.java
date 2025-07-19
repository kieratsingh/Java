import java.util.Scanner;
public class trianglesum
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 3 sides of the triangle respectively");
        int s1,s2,s3;
        s1=in.nextInt();
        s2=in.nextInt();
        s3=in.nextInt();
        if(s1==s2 && s2==s3)
        {
            System.out.print("Triangle is equilateral ");
        }
        else if(s1==s2 || s2==s3 || s1==s3)
        {
            System.out.print("Triangle is isoscales:");
        }
        else
        {
            System.out.print("Triangle is scalene");
        }

    }
}
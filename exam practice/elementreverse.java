import java.util.Scanner;
public class elementreverse
{
    Scanner in = new Scanner(System.in);
    int a[]=new int[20];
    int n;
    void input()
    {
        System.out.print("Enter the size :");
        n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element :");
            a[i]=in.nextInt();
        }
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
    void reverse()
    {
        for(int i=0;i<n;i++)
        {
            int temp=a[i];
            int d=0,r=0;
            while(temp>0)
            {
                d=temp%10;
                temp=temp/10;
                r=r*10+d;
            }
            a[i]=r;
        }
    }
    public static void main()
    {
        elementreverse obj=new elementreverse();
        obj.input();
        obj.display();
        obj.reverse();
        System.out.print("\nReverse of each element :\n");
        obj.display();
    }
}
import java.util.Scanner;
public class combinearray
{
    public static void main()
    {
        int a[]=new int[6];
        int b[]=new int[4];
        int c[]=new int[a.length + b.length];
        for(int i=0;i<6;i++)
        {
            a[i]=(i+1);
        }
        for(int i=0;i<4;i++)
        {
            b[i]=(i+1);
        }
        for(int i=0;i<6;i++)
        {
            c[i]=a[i];
        }
        for(int i=0;i<4;i++)
        {
            c[a.length+i]=b[i];
        }
        System.out.print("\nArray A:\n");
        for(int i=0;i<6;i++)
        {
            System.out.print(a[i] +"\n");
        }
        System.out.print("\nArray B:\n");
        for(int i=0;i<4;i++)
        {
            System.out.print(b[i] +"\n");
        }
        System.out.print("\nArray C:\n");
        for(int i=0;i<10;i++)
        {
            System.out.print(c[i] +"\n");
        }
    }
}
import java.util.Scanner;
public class binarys
{
    public static void main()
    {
        int a[]={7,6,5,4,3,2,1};
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\n");
        }
        int b=0,e=a.length-1,m;
        int n=6;
        int flag=0;
        System.out.print(e);
        while(b<=e)
        {
            m=(b+e)/2;
            System.out.print(m);
            if(a[m]>n)
            {
                b=m+1;
            }
            else if(a[m]<n)
            {
                e=m-1;
            }
            else
            {
                System.out.print("Element fount at position :"+(m+1));
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.print("Element not found");
        }
    }
}
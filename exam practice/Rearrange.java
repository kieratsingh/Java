import java.util.Scanner;
public class Rearrange 
{
    int a[], n,pos,item;
    Scanner in = new Scanner(System.in);
    Rearrange()
    {
        System.out.print("Enter the size of the array :");
        n=in.nextInt();
        a=new int[n+1];
    }
    void input()
    {
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter "+(i+1)+" element");
            a[i]=in.nextInt();
        }
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] +"\t");
        }
    }
    void inserted()
    {
        System.out.print("Enter the element to insert :");
        item=in.nextInt();
        System.out.print("Enter the position to insert the above element :");
        pos=in.nextInt();
        if(pos>n)
        {
            System.out.print("Invalid input");
        }
        else
        {
            for(int i=n;i>pos-1;i--)
            {
                a[i]=a[i-1];
            }
            n++;
            a[pos-1]=item;
            display();
        }
    }
    void remove()
    {
        System.out.print("Enter the position to remove :");
        pos=in.nextInt();
        if(pos<0 || pos>n)
        {
            System.out.print("Invalid input");
        }
        else
        {
            n--;
            for(int i=pos-1;i<n;i++)
            {
                a[i]=a[i+1];
            }
            display();
        }
    }
    void main()
    {
        Rearrange obj=new Rearrange();
        obj.input();
        obj.display();
        obj.inserted(); 
        obj.remove();
    }
}
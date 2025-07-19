import java.util.Scanner;
public class oddevenarray
{
    public static void main()
    {
        int a[]=new int[20];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<20;i++)
        {
            System.out.print("Enter element "+(i+1)+" :");
            a[i]=in.nextInt();
        }
        int countodd=0,counteven=0,count4=0;
        for(int i=0;i<20;i++)
        {
            if(a[i]%2==0)
            {
                counteven++;
            }
            else
            {
                countodd++;
            }
        }
        for(int i=0;i<20;i++)
        {
            if(a[i]%4==0)
            {
                count4++;
            }            
        }
        System.out.print("Number of even numbers in the array :"+ counteven);
        System.out.print("Number of odd numbers in the array :"+ countodd);
        System.out.print("Number of multiples of 4 in the array :"+ count4);

    }
}
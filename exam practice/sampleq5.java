import java.util.Scanner;
public class sampleq5
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students :");
        int N=in.nextInt();
        String name[]=new String[N];
        int totalmarks[] = new int[N];
        int avg=1,sum=0;
        for(int i=0;i<N;i++)
        {
            System.out.print("Enter name of student "+(i+1)+": ");
            name[i]=in.next();
        }
        for(int i=0;i<N;i++)
        {
            System.out.print("Enter marks of "+name[i]+": ");
            totalmarks[i]=in.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            sum=sum+totalmarks[i];
        }
        avg=sum/N;
        int d[]=new int[N];
        for(int i=0;i<N;i++)
        {
            d[i]=totalmarks[i]-avg;
        }
        System.out.println("Average of totalmarks of all students ="+ avg);
        System.out.println("Deviation of totalmarks of all students =");
        for(int i=0;i<N;i++)
        {
            System.out.print(name[i]+":\t"+d[i]+"\n");
        }
    }
}
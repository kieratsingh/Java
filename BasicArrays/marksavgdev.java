import java.util.Scanner;
public class marksavgdev
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students :");
        int n=in.nextInt();
        String name[]=new String[n];
        double marks[]=new double[n];
        double avg=1,sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the marks of the student :");
            marks[i]=in.nextDouble();
            String t=in.nextLine();
            System.out.print("Enter the name :");
            name[i]=in.nextLine();
            sum=sum+marks[i];
        }
        avg=sum/n;
        System.out.println("Average marks ="+avg);
        for(int i=0;i<n;i++)
        {
            System.out.println("Deviation of "+(name[i])+" is "+(marks[i]-avg));
        }
    }
}
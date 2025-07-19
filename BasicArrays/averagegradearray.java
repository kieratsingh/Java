import java.util.Scanner;
public class averagegradearray
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements :");
        n=in.nextInt();
        int ap[] = new int[n];
        int ac[] = new int[n];
        int am[] = new int[n];
        double a[] = new double[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter marks of student in phy,chem and math respectively:");
            ap[i]=in.nextInt();
            ac[i]=in.nextInt();
            am[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            a[i]=(ap[i]+ac[i]+am[i])/3;
        }
        int counta=0,countf=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=80)
            {
                counta++;
            }
            else if(a[i]<=30)
            {
                countf++;
            }
        }
        System.out.print("Number of students below 30% :"+countf);
        System.out.print("\nNumber of students above 80% :"+counta);
    }
}
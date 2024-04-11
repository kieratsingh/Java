import java.util.Scanner;
public class question7
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int n=in.nextInt();
        int marks[] = new int[n];//input of marks array
        int f1=0,f2=0,f3=0,f4=0;
        for(int i=0;i<n;i++)//loop to check marks 
        {
            System.out.println("Enter the marks of student " +(i+1)+ " :");
            marks[i]=in.nextInt();
            if(marks[i]>100)
            {
                System.out.print("Invalid input");
            }
            else if(marks[i]>80)
            {
                f4++;
            }
            else if(marks[i]>60)
            {
                f3++;
            }
            else if(marks[i]>40)
            {
                f2++;
            }
            else
            {
                f1++;
            }
        }
        System.out.println("Marks \tNumber of students:");
        System.out.println("Less than 40\t"+f1);
        System.out.println("40-60\t"+f2);
        System.out.println("60-80\t"+f3);
        System.out.println("Higher than 80\t"+f4);
    }//end of void main
}
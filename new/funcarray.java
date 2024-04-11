import java.util.*;
public class funcarray
{
    int row,col;
    int ma[][] = new int[10][10];
    Scanner in = new Scanner(System.in);
    void input(int m[][],int r,int c)
    {
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                System.out.println("Enter the element in row-" + (i+1) +" and column-" + (j+1) + ":");
                m[i][j] = in.nextInt();
            }
        }
    }
    void display(int m[][],int r,int c)
    {
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
    int summat(int m[][],int r,int c)
    {
        int s=0,i,j;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                s+=m[i][j];
            }
        }
        return s; 
    }
    void main()
    {
        int ma2[][] = new int[10][10];
        System.out.print("Enter the number of rows :");
        row=in.nextInt();
        System.out.print("Enter the number of columns :");
        col=in.nextInt();
        input(ma,row,col);
        System.out.print("\nThe matrix is :\n");
        display(ma,row,col);
        input(ma2,3,3);
        display(ma2,3,3);
        System.out.print("Sum of first matrix is= "+summat(ma,row,col));
        System.out.print("Sum of second matrix is= "+summat(ma2,3,3));
    }
}
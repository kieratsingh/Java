import java.util.Scanner;
public class add2array
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int m1[][],m2[][],m[][],r1,r2,r,c1,c2,c,i,j;
        System.out.print("Enter the number of rows in first matrix:");
        r1=in.nextInt();
        System.out.print("Enter the number of columns in first matrix:");
        c1=in.nextInt();
        m1=new int[r1][c1]; 
        System.out.print("Enter the number of rows in second matrix:");
        r2=in.nextInt();
        System.out.print("Enter the number of columns in second matrix:");
        c2=in.nextInt();
        m2=new int[r2][c2];
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print("Enter element of row" +(i+1)+" and column" + (j+1));
                m1[i][j]=in.nextInt();                
            }
        }
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print("Enter element of row" +(i+1)+" and column" + (j+1));
                m2[i][j]=in.nextInt();    
            }
        }
        System.out.println("First matrix is :");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print(m1[i][j]+ "\t");              
            }
            System.out.println();
        }
        System.out.print("Second matrix is :");
        for(i=0;i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                System.out.print(m2[i][j]+ "\t");              
            }
            System.out.println();
        }
        if(r1==r2 && c1==c2)
        {
            r=r1;c=c1;
            m=new int[r][c];
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    m[i][j] = m1[i][j] + m2[i][j];                    
                }
            }
            System.out.println("Sum of the 2 matrix is :");
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    System.out.print(m[i][j]+ "\t");                    
                }
                System.out.println();
            }

        }
        else
        {
            System.out.print("Matrix are of different order so addition is not possible");
        }
    }
}
import java.util.Scanner;

public class swapd
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);        
        System.out.print("Enter the number of rows: ");
        int r = in.nextInt();        
        System.out.print("Enter the number of columns: ");
        int c = in.nextInt();        
        int[][] matrix=new int[r][c];       
        System.out.println("Enter the matrix elements:");
        for (int i=0;i<r;i++) 
        {
            for (int j=0;j<c;j++) 
            {
                matrix[i][j]=in.nextInt();
            }

        }
        System.out.print("\nOriginal matrix :\n");
        for (int i=0;i<r;i++) 
        {
            for (int j=0;j<c;j++) 
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        if(r==c)
        {
            for (int i=0;i<r;i++) 
            {
                int temp = matrix[i][i];
                matrix[i][i]=matrix[i][c - 1 - i];
                matrix[i][c-1-i]=temp;
            }        

            System.out.println("\nMatrix after swapping diagonals:\n");
            for (int i=0;i<r;i++) 
            {
                for (int j=0;j<c;j++) 
                {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.print("Not a square matrix:"); 
        }
    }
}

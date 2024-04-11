public class patern
{
    public static void main()
    {
        for(int i=1;i<=5;i++)
        {
            int f=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(f--);
            }
            System.out.println();
        }
    }
}
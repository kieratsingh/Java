
public class str
{
    public static void main()
    {
        int n=62;
        int m=64,temp,s=0;
        System.out.print("Helo");
        if(m>n)
        {
            for(int i=n;i<=m;i++)
            {
                temp=i;
                while(temp>0)
                {
                    int d=temp%10;
                    s=s+d;
                    temp=temp/10;
                }
                if(i%s==0)
                {
                    System.out.print("It is a harshad number :");
                }
            }
        }
        if(n>m)
        {
            for(int i=m;i<=n;i++)
            {
                temp=i;
                while(temp>0)
                {
                    int d=temp%10;
                    s=s+d;
                    temp=temp/10;
                }
                if(i%s==0)
                {
                    System.out.print("It is a harshad number :");
                }
            }
        }
    }
}
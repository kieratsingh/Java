import java.util.Scanner;
public class frequencyvowel
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s=in.nextLine();
        int fa=0,fe=0,fi=0,fo=0,fu=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='A')            
                fa++;
            else if(s.charAt(i)=='e' || s.charAt(i)=='E')            
                fe++;
            else if(s.charAt(i)=='i' || s.charAt(i)=='I')            
                fi++;
            else if(s.charAt(i)=='o' || s.charAt(i)=='O')            
                fo++;
            else if(s.charAt(i)=='u' || s.charAt(i)=='U')            
                fu++;
        }
        System.out.println("Frequency of the vowel 'a' = "+ fa);
        System.out.println("Frequency of the vowel 'e' = "+ fe);
        System.out.println("Frequency of the vowel 'i' = "+ fi);
        System.out.println("Frequency of the vowel 'o' = "+ fo);
        System.out.println("Frequency of the vowel 'u' = "+ fu);
        
    }
}
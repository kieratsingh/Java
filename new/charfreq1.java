import java.util.Scanner;

public class charfreq1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = in.nextLine();
        str = str.toUpperCase(); // Assign the result back to str
        int count;

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            
                System.out.println("Occurrence of " + ch + " in " + str + " = " + count);
            }
        }
    }


import java.util.Scanner;
import java.util.regex.Pattern;

public class NumberPyramidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        Pattern(n);

        }
        static void Pattern(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) { // spaces
                    System.out.print(" " + " ");
                }
                for (int j = 1; j <= i; j++) {   //stars
                    System.out.print(j + " ");
                }
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
    }
}

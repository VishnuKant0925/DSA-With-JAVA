import java.util.Scanner;

public class CountNoOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        String s=n+"";
        System.out.println(s.length());
    }
}

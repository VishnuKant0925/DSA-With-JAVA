import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Fibonacci Numbers 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int next = 0;
        for (int i = 1 ; i <= n; i++) {
            System.out.print(first+" ");
            next = first + second;
            first = second;
            second = next;
        }

    }
}

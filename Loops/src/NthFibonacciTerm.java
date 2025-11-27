import java.util.Scanner;

import java.util.Scanner;
public class NthFibonacciTerm {
    public static void main(String[] args) {
        // Fibonacci Numbers 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n :");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int next = 0;
        if(n==1){
            System.out.println(first);
        } else if (n==2) {
            System.out.println(second);
        }
        for (int i = 3 ; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        if (n>2) {
            System.out.println(next);
        }
    }
}

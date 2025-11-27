import java.util.Scanner;

public class ReverseFloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int total = n * (n + 1) / 2; // last number in Floyd's triangle

        for (int i = n; i >= 1; i--) {
            int start = total-i+1;
            int end = total;
            for (int j = start; j <= end; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            total=total-i;
        }
    }
}

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square : ");
        int n = sc.nextInt();
        for(int i=1; i<=n ;i++){ //rows
            for(int j=1; j<=n ;j++){ //columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

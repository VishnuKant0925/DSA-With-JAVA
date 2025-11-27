import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square : ");
        int n = sc.nextInt();
        for(int i=1; i<=n ;i++){ //rows
            for(int j=1; j<=n ;j++){//columns

                char alphabet = (char)(j+64);

                System.out.print(alphabet+" ");
            }
            System.out.println();
        }

    }
}

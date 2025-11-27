import java.util.Scanner;

public class ReverseAlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");

        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i ;j++){
                char alphabet = (char)(i+64);
                System.out.print(alphabet+" ");
            }
            System.out.println();
        }
    }
}

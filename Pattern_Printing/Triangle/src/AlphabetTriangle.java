import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i ;j++){
                char alphabet= (char)(64+j);
                System.out.print(alphabet+" ");
            }
            System.out.println();
        }
    }
}

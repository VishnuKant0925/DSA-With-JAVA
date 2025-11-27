import java.sql.SQLOutput;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of 1st Matrix : ");
        int r1 = sc.nextInt();
        System.out.println("Enter the cols of 1st Matrix : ");
        int c1 = sc.nextInt();
        System.out.println("Enter the col of 2nd Matrix : ");
        int c2 = sc.nextInt();
        System.out.println("Enter the elements of 1st matrix");
        int[][] A = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd matrix");
        int[][] B = new int[c1][c2];
        for (int i = 0; i < c1; i++){
            for (int j = 0; j < c2; j++){
                B[i][j] = sc.nextInt();
            }
        }

        int [][] C= new int[r1][c2];
        for(int i =0 ;i< r1;i++){
            for(int j =0; j<c2;j++){
                for(int k =0;k<c1;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }

    }
}

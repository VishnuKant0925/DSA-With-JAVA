import java.sql.Array;
import java.util.Scanner;

public class OutputOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n =sc.nextInt();
        int[] A=new int[n];

        // input  -> loop
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+"th element :-");
            A[i]=sc.nextInt();
        }
        //output   -> loop

        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
    }
}

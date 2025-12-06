import java.util.Scanner;

public class Print_N_To_1_DecreasingOrder {
    public static void Print(int n ){
        System.out.print(n+" ");
        if(n>=2){
            Print(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        Print(n);
    }
}

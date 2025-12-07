import java.util.Scanner;

public class Print_1_To_N_RECURSIVECALL {
    public static void Print(int n ){
        if(n==0) return;   //basecase
        Print(n-1);   // recursive call
        System.out.print(n+" "); //work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        Print(n);
    }
}

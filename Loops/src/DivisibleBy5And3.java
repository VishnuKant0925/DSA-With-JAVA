import java.util.Scanner;

public class DivisibleBy5And3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        for(int i= 1 ; i<=n;i++){
            if(i%3==0 || i%5==0){
                System.out.println(i+" ");
            }
        }
    }
}

import java.util.Scanner;

public class Sum_Parameterised {
    public static void Sum(int n , int sum){
        if(n==0){
            System.out.println("Sum is : "+sum);
            return;
        }
        Sum(n-1,sum+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value n :");
        int n = sc.nextInt();
        Sum(n,0);
    }
}

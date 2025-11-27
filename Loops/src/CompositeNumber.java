import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int x=0;

        for(int i = 2; i<=n-1;i++){
            if(n%i==0){
                System.out.println(n+": is composite");
                x=1;
                break;
            }
        }
        if(n==1){
            System.out.println("Neither Prime nor Composite ");
        }
        else if(x==0) {
            System.out.println(n + ": is not composite It is prime ");
        }
    }
}

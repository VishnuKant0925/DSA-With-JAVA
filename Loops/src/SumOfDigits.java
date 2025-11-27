import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit : ");
        int n = sc.nextInt();
        int r= 0;
        int sum=0;
        while(n!=0){
            r=n%10;
            n=n/10;
            sum+=r;
        }
        System.out.println("Sum is : "+sum);
    }
}

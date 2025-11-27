import java.util.Scanner;

public class GCDofTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int s=0 , g=0; //used to store small of a and b
        int gcd =1;
        if (a>b){
            s=b;
            g=a;
        }else{
            s=a;
            g=b;
        }
        for (int i=1 ; i<=s ;i++){
            if(g%i==0 && s%i==0){
                gcd=i;

            }
        }
        System.out.println("GCD is : "+gcd);
    }
}

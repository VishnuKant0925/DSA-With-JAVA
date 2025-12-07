import java.util.Scanner;

public class PowerLinear {
    public static int Expo(int a, int b){
        if(b==0) return 1;
        return a*Expo(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = Expo(a,b);
        System.out.println(a+" raised to "+b+" is :"+result);

    }
}

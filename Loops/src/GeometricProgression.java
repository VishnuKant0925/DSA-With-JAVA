import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term : ");
        int n = sc.nextInt();

        //GP :- 1,2,4,8,16,32,.........n

        int a = 1, r= 2;
        for(int i = 1 ; i<=n ;i++){
            System.out.print(a+" ");
            a*=r;
        }

    }
}

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        //using the formula of J(th) odd number i.e. 2*j-1
        for(int i= 1; i<=n;i++){
            for(int j= 1; j<=i;j++){
                System.out.print(2*j-1+" ");
            }
            System.out.println();
        }

        System.out.println("-----------:2nd method :----------");

        for(int i= 1; i<=n;i++){
            for(int j= 1; j<=i*2-1;j=j+2){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("-----------:3rd method :----------");



        for(int i= 1; i<=n;i++){
            int a=1;
            for(int j= 1; j<=i;j++){
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }
    }
}

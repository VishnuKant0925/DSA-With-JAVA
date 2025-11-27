import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term ");
        int n = sc.nextInt();

        //AP is   :-   4,7,10,13.6........n
        // using AP formula of maths

        for (int i =4 ; i<=3*n+1 ;i+=3){
          System.out.print(i+" ");
       }

        //without using AP maths formula

        int a=4 , d=3 ;
        System.out.println("/n");
        for(int j=1;j<=n;j++){
            System.out.println(a);
            a+=d;
        }

    }
}

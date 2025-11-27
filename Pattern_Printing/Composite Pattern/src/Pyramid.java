import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        for(int i= 1 ; i<=n ; i++){
            for(int j=1;j<=n-i;j++){ // spaces
                System.out.print(" "+" ");
            }
            for(int j=1 ;j<=2*i-1 ;j++){   //stars
                System.out.print("*"+" ");
            }
            System.out.println();

        }


        System.out.println("---------Second Method(nsp and nst)------------");

        int nsp= n-1 ; //initially
        int nst= 1;    //initially

        for(int i= 1 ; i<=n ; i++){
            for(int j=1;j<=nsp;j++){ // spaces
                System.out.print(" "+" ");
            }
            for(int j=1 ;j<= nst ;j++){   //stars
                System.out.print("*"+" ");
            }
            nsp=nsp-1;
            nst=nst+2;
            System.out.println();

        }


    }
}

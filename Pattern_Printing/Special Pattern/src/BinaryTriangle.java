import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%2==1) {
                    if(j%2==1){
                    System.out.print("1" + " ");
                    }else{
                        System.out.print("0" + " ");
                    }
                } else {    //i is even
                    if(j%2==0) {
                        System.out.print("1" + " ");
                    }else{
                        System.out.print("0" + " ");
                    }
                }
            }
            System.out.println();
        }

        System.out.println("---------Second method of (i+j) is even ----------");
        for(int i= 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }

    }
}


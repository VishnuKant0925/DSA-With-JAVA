import java.util.Scanner;

public class MixedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n =sc.nextInt();
        boolean isNumber = (n%2 != 0);
        for(int i =1 ;i<=n;i++){
            for(int j=1; j<=n+1-i ;j++){
                if(isNumber){
                    System.out.print(j+" ");

                }else{
                    char alphabet = (char)(64+j);
                    System.out.print(alphabet+" ");
                }
            }
            System.out.println();
            isNumber=!isNumber;
        }
    }
}

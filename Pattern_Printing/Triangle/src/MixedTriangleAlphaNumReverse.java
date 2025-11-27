import java.util.Scanner;
public class MixedTriangleAlphaNumReverse {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of n :");
            int n = sc.nextInt();

            for(int i=1;i<=n;i++){
                for(int j=1;j<=n+1-i ;j++){
                    if(i%2==0){
                        System.out.print(j+" ");
                    }else{
                        char alphabet=(char)(j+64);
                        System.out.print(alphabet+" ");
                    }
                }

                System.out.println();
            }
        }
    }




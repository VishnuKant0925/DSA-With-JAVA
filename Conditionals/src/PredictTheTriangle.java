import java.util.Scanner;

public class PredictTheTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 sides of triangle : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if(a+b>c && b+c>a && c+a>b){
            if(a==b && b==c ){
                System.out.println("Equilateral Triangle");
            }else if(a==b || b==c || c==a){
                System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
            }
        }else{
            System.out.println("Sides does not forms a Triangle");
        }
    }
}

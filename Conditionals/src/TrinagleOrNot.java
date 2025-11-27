import java.util.Scanner;

public class TrinagleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  3 sides of Triangle one by one ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // condition sum of two sides is always greater than 3rd side

        if((a+b)>c && (a+c)>b && (b+c)>a){
            System.out.println("This Forms a Trinagle ");
        }else{
            System.out.println("Not a triangle");
        }
    }
}

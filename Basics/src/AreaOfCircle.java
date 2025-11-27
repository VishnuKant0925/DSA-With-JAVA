import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        double radius = sc.nextDouble();
        double result;
        result=3.14*radius*radius;
        System.out.println("Area is : "+result);
    }
}

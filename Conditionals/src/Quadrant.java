import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Points : ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(x>0 && y>0){
            System.out.println("Points : "+x+","+y+" lies in 1st Quadrant");
        } else if (x>0 && y<0) {
            System.out.println("Points : "+x+","+y+" lies in 4st Quadrant");
        } else if (x<0 && y>0) {
            System.out.println("Points : "+x+","+y+" lies in 2st Quadrant");
        } else if (x<0 && y<0) {
            System.out.println("Points : "+x+","+y+" lies in 3st Quadrant");
        } else if (x==0 && y==0) {
            System.out.println("Points : "+x+","+y+" lies on origin");
        } else if (x==0) {
            System.out.println("Points : "+x+","+y+" lies on y axis");
        } else if (y==0) {
            System.out.println("Points : "+x+","+y+" lies on x axis");
        }
    }
}

import java.util.Scanner;

public class ReverseStringUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder s = new StringBuilder(str);
        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}

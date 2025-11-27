import java.util.Scanner;

public class InputToStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        sb.setCharAt(1,'r');
        System.out.println(sb);
    }
}

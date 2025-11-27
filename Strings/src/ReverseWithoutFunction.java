import java.util.Scanner;

public class ReverseWithoutFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        int j=n-1;
        int i =0;
        while(i<j){
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(j);

            sb.setCharAt(i,ch2);
            sb.setCharAt(j,ch1);
            i++;
            j--;

        }
        System.out.println(sb);
    }
}

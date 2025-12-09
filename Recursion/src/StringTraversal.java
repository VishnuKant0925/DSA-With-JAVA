import java.util.Scanner;

public class StringTraversal {
    public static void print(int idx , String s){
        if(idx==s.length()) return;
        System.out.print(s.charAt(idx));
        print(idx+1,s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();
        print(0,s);
    }
}

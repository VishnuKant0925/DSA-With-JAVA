import java.util.Arrays;
import java.util.Scanner;

public class SortingOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] ch = str.toCharArray();

        System.out.println();
        Arrays.sort(ch);
        for(char ele: ch ){
            System.out.print(ele);
        }


    }
}

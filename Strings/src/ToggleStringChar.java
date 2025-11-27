import java.util.Scanner;

public class ToggleStringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0;i<sb.length();i++){
           char ch = str.charAt(i);
           int ascii = (int)ch;
           if(ascii>=63&&ascii<=90){
                ascii+=32;
               
           }else if(ascii>=97&&ascii<=122){
                ascii-=32;
           }
           ch=(char)ascii;
           sb.setCharAt(i,ch);
        }
        System.out.println(sb);
    }
}

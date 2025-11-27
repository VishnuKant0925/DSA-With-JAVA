import java.util.Scanner;

public class UpdateEvenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String s ="";
        for(int i = 0;i<str.length();i++){
            if(i%2==0){
              s = s+'a';
            }else{
                s += str.charAt(i);
            }

        }
        str=s;
        System.out.println(str);
    }
}

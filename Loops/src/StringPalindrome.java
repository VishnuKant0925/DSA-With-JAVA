import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string  ");
        String str = sc.nextLine();

        // Convert to lowercase to ignore case sensitivity
        str = str.toLowerCase();
        boolean isPalindrome = true;
        for(int i = 0 ; i<=str.length()/2 ; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                isPalindrome=false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }

    }
}

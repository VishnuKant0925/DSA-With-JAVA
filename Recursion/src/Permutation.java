import java.util.Scanner;

public class Permutation {
    public static void printPermutation(String ans ,String str){
        if(str.isEmpty()){ // str.length==0
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            printPermutation(ans+ch,left+right);
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        printPermutation("",str);
    }
}

import java.util.Scanner;

public class Subsets_Of_String {
    public static void substring(String s , int i,String ans){
        if(i==s.length()){
            System.out.print(ans+" ");
            return;
        }
        char ch=s.charAt(i);
        substring(s,i+1,ans+ch);
        substring(s,i+1,ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        substring(s,0,"");
    }
}

import java.util.Scanner;

public class Skip_Character_In_String {
    public static void skip(int i,String s ,char ch, String ans){
        if(i==s.length()) {
            System.out.println(ans);
            return;
        }
        if(s.charAt(i)!=ch) ans+=s.charAt(i);
        skip(i+1,s,ch,ans);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s =sc.nextLine();
        System.out.println("Enter the character to skip : ");
        char ch = sc.next().charAt(0);
        skip(0,s,ch,"");
    }
}

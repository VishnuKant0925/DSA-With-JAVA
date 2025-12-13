import java.util.Scanner;

public class CountAndSay {
    public static String count_and_say(int n) {
        if(n==1) return "1";
        String s =count_and_say(n-1);
        String ans="";
        int i=0, j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int len=j-i;
                ans+=len;
                ans+=s.charAt(i);
                i=j;
            }
        }
        int len=j-i;
        ans+=len;
        ans+=s.charAt(i);
        i=j;
        return ans;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n =sc.nextInt();
        String ans= count_and_say(n);
        System.out.println(ans);
    }
}

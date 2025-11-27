import java.util.Scanner;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int i =0 , j=0;
        int n = sb.length();
        while(j<n){
            if(sb.charAt(j)!=' '){
                j++;
            }else{
                reverse(sb,i,j-1);
                i=j+1;
                j=i;
            }
        }
        reverse(sb,i,j-1); // for last word reverse
        System.out.println(sb);
    }

    public static  void reverse(StringBuilder sb , int i, int j){
        while(i<j){
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(j);

            sb.setCharAt(i,ch2);
            sb.setCharAt(j,ch1);
            i++;
            j--;
        }
    }
}

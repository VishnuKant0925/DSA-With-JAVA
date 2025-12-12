import java.util.ArrayList;
import java.util.Scanner;

public class Subset_Global_Variable {
   static ArrayList<String> arr = new ArrayList<>();
    public static void printSubset(String str, int i,String ans){
        if(i==str.length()){
            arr.add(ans);
            return;
        }
        char ch= str.charAt(i);
        printSubset(str,i+1,ans+ch);
        printSubset(str,i+1,ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        arr=new ArrayList<>(); // reset the array list it is necessary when pass multiple test cases
        printSubset(str,0,"");
        System.out.println(arr);
    }
}

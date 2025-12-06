import java.util.*;
public class Print_IncreasingOrder_1_To_N {
    public static void Print(int x , int n){
        if(x>n) return;
        System.out.println(x);
        Print(x+1,n);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        Print(1,n);
    }
}

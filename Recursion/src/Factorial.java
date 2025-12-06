import java.util.*;
public class Factorial
{
    public static int fact(int n ){
        if(n==1) return 1;
        return n*fact(n-1);
    }

    public static void main (String[] args) throws java.lang.Exception
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        int res=fact(n);
        System.out.println("Factorial : "+res);
        }
}

import java.util.Scanner;

public class Nth_Fibonacci_Term {
    public static int Fibo(int n){
        if(n<=1) return n;
        return Fibo(n-1)+Fibo(n-2);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  n :  ");
        int n = sc.nextInt();
        int res=Fibo(n);
        System.out.println(n+"th Fibonacci term is "+res);
    }
}

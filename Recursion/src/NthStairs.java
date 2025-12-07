import java.util.Scanner;

public class NthStairs {
    public static int Stair(int n){
        if(n<=2) return n;
        return Stair(n-1)+Stair(n-2);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  n :  ");
        int n = sc.nextInt();
        int res=Stair(n);
        System.out.println(n+"th Stair ways are "+res);
    }
}

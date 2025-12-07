import java.util.Scanner;

public class Power_Logarithmic {
    public static int PowerLog(int a , int b){
        if(b==0) return 1;
        int ans=PowerLog(a,b/2);
        if(b%2==0) return ans*ans;
        else return ans*ans*a;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b= sc.nextInt();
        int res=PowerLog(a,b);
        System.out.println(a+" raised to "+b+" is "+res);
    }
}

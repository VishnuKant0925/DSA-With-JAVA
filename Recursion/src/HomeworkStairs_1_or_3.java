import java.util.Scanner;

public class HomeworkStairs_1_or_3 {
    public static int Stair(int n){
        if(n==2 || n==1) return 1;
        if(n==3) return 2;
        return Stair(n-1)+Stair(n-3);
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

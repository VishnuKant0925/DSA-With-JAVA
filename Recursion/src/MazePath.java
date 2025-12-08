import java.util.Scanner;

public class MazePath {
    public static int Maze(int m, int n){
        if(m==1 )  return 1;  // if you reached last row than there is only one way . GO RIGHT WAYS.
        if (n==1) return 1;   // if you reached last COL than there is only one way . GO DOWN WAYS.
        int rightWays = Maze(m,n-1);
        int downWays= Maze(m-1,n);
        return rightWays+downWays;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  rows :  ");
        int m = sc.nextInt();
        System.out.println("Enter cols : ");
        int n = sc.nextInt();

        // function call
        int totalWays = Maze(m,n);
        System.out.println("Total Number of ways is : "+totalWays);

    }
}

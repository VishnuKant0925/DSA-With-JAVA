import java.util.Scanner;

public class MazePath_Extra_Parameter {
    public static int Maze(int row , int col,int m, int n ){
        if(row==m )  return 1;  // if you reached last row than there is only one way . GO RIGHT WAYS.
        if (col==n) return 1;   // if you reached last COL than there is only one way . GO DOWN WAYS.
        int rightWays = Maze(row,col+1,m,n);
        int downWays= Maze(row+1,col,m,n);
        return rightWays+downWays;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  rows :  ");
        int m = sc.nextInt();
        System.out.println("Enter cols : ");
        int n = sc.nextInt();

        // function call
        int totalWays = Maze(1,1,m,n);
        System.out.println("Total Number of ways is : "+totalWays);

    }
}

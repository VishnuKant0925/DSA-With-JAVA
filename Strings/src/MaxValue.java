import java.util.Arrays;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr={"455","746745","56354","0025"};

        int mx = Integer.parseInt(arr[0]);
        for(int i=1;i< arr.length;i++){
           int n = Integer.parseInt(arr[i]);
           mx=Math.max(mx,n);
        }
        System.out.println(mx);
    }
}

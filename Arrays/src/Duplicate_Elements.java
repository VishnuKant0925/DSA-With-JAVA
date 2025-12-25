import java.util.Arrays;
import java.util.Scanner;

public class Duplicate_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}

import java.util.Scanner;

public class Difference_Of_SumOfOdd_Even_Index_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sumEven=0;
        int sumOdd=0;
        for(int i=0;i<n;i++){
            if(i%2==0) sumEven+=arr[i];
            else sumOdd+=arr[i];
        }
        int difference=sumEven-sumOdd;
        System.out.println("Difference is : "+difference);
    }
}

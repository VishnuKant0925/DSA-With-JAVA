import java.util.Scanner;

public class  RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 50, 32, 78, 50, 69};
        System.out.println("Enter the value of 'k' (Rotation) ");
        int k = sc.nextInt();
        int n = arr.length;
        for (int ele : arr) {  //original array
            System.out.print(ele + " ");
        }

        int[] brr = new int[n];
        k = k % n;
        int j = 0;
        for (int i = n - k; i < n; i++) {
            brr[j] = arr[i];
            j++;
        }
        for (int i = 0; i <= n-k-1; i++) {
            brr[j] = arr[i];
            j++;

        }

        System.out.println();
        for (int ele : brr) {  //original array
            System.out.print(ele + " ");
        }
    }
}

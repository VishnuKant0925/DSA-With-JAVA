import java.util.Scanner;

public class Greater_Than_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of x:");
        int x= sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>x) count++;
        }
        System.out.println(count+" elements are greater than : "+x);
    }
}

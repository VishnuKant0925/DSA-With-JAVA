import java.util.Scanner;

public class Minimum_Value_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min =Integer.MAX_VALUE;
        for(int ele:arr){
            if(ele<min) min=ele;
        }
        System.out.println("Minimum value out of all is :"+min);
    }
}

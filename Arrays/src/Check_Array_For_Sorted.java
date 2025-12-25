import java.util.Scanner;

public class Check_Array_For_Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                flag=false;
            }
        }
        if(flag) System.out.println("Sorted");
        else System.out.println("Not Sorted ");
    }
}

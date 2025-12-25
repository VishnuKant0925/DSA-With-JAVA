import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n =sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the Elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int product=1;
        for(int ele : arr){
            product=product*ele;
        }
        System.out.println("Product is :"+product);
    }
}

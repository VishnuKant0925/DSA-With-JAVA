import java.util.Scanner;

public class RotateArray_WithoutExtraArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,20,50,32,78,50,69};
        System.out.println("Enter the value of 'k' (Rotation) ");
        int k = sc.nextInt();
        Rotate(arr,k);
        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
    public static void reverse(int [] arr , int i ,int j){
        while(i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void Rotate(int [] arr , int k ){
        int n =arr.length;
        k=k%n;
        reverse( arr ,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
}

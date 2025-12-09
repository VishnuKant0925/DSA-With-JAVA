import java.util.Scanner;

public class ArrayTraversal {
    public static void print(int idx , int [] arr){
        if(idx==arr.length) return;
        System.out.print(arr[idx]+" ");
        print(idx+1,arr);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        print(0,arr);
    }
}

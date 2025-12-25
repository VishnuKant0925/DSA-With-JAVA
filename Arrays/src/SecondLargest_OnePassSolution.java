import java.util.Scanner;

public class SecondLargest_OnePassSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n =sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the Elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            } else if (arr[i]>smax && arr[i]!=max) {
               smax=arr[i];
            }
        }
        System.out.println("Second Maximum Number is : "+smax);
    }
}

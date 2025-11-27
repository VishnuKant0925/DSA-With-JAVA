import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr={12,343,456,76};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        int[] nums= arr ; // Shallow copy means any change in nums array will reflect in arr i.e. main array
        System.out.println("\n copy using inbuilt method");
        // 1 method of deep copy
        int[] copyArray = Arrays.copyOf(arr,arr.length);
        for(int ele : copyArray){
            System.out.print(ele+" ");
        }
        // 2 nd method
        System.out.println("\n copy using loops");
        int [] crr = new int[arr.length];
        for(int i=0; i< arr.length ; i++){
            crr[i]=arr[i];
        }
        for(int ele : crr){
            System.out.print(ele+" ");
        }

    }
}

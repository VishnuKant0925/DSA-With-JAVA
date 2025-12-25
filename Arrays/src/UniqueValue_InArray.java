import java.util.Arrays;

public class UniqueValue_InArray {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,3,4,2,3,4,5,3,7,6};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                System.out.println("Unique element is :"+arr[i]);
            }
        }
    }
}

import java.util.Arrays;

public class BuildInMethods {
    public static void main(String[] args) {
        int[] arr ={30,40,10,56,3,78,64,12};

        for(int ele : arr){  // for-each loop
            System.out.print(ele+" ");
        }
        Arrays.sort(arr); // sorts the array
        System.out.println();
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}

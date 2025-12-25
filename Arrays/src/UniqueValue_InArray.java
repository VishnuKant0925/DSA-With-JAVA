import java.util.Arrays;

public class UniqueValue_InArray {
    public static int findUnique(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        for (int i = 0; i < n - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        return arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr={2,4,2,4,6,3,3};
        int unique=findUnique(arr);
        System.out.println("Unique is :"+unique);
    }
}

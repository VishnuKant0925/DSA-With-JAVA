public class QuickSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {4,9,7,1,3,2,6,5,8};
        int n = arr.length;
        print(arr);

    }
}

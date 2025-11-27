public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int temp;
        for(int i=0;i<n/2;i++){
            int j=n-1-i;

            temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}

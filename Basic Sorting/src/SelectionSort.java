public class SelectionSort {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void main(String[] args) {
        int [] arr = {10,-4,5,1,-6,};
        int n = arr.length;
        print(arr);
        for(int i=0;i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int min_idx= -1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    min_idx=j;
                }
            }
            swap(arr,i,min_idx);
        }
        print(arr);
    }
}

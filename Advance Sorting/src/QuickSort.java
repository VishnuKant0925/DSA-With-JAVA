public class QuickSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[] arr, int low,int high){
        int pivot=arr[low];
        int pivotIndex=low;
        int smallerCount=0;
        for(int i=low+1;i<=high;i++){
            if(arr[i]<=pivot) smallerCount++;
        }
        int correctIndex=pivotIndex+smallerCount;
        swap(arr,pivotIndex,correctIndex);

        //partition
        int i=low, j=high;
        while(i<correctIndex && j>correctIndex){
            if(arr[i]<pivot) i++;
            else if(arr[j]>pivot) j--;
            else if (arr[i]>pivot && arr[j]<pivot) {
                swap(arr,i,j);
            }
        }
        return correctIndex;
    }
    public static void quicksort(int [] arr , int low ,int high){
       if(low>=high) return; // BASE CASE
       int pivotIndex= partition(arr,low,high);
       quicksort(arr,low,pivotIndex-1);
       quicksort(arr,pivotIndex+1,high);
    }
    public static void main(String[] args) {
        int [] arr = {4,9,90,1,3,2,6,5,8};
        int n = arr.length;
        print(arr);
        quicksort(arr,0,n-1);
        print(arr);

    }
}

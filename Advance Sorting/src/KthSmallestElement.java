import java.util.Scanner;

public class KthSmallestElement {
    static int ans;
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
        int mid=(low+high)/2;
        int pivot=arr[mid];
        int pivotIndex=mid;
        int smallerCount=0;
        for(int i=low;i<=high;i++){
            if(i==mid) continue;
            if(arr[i]<=pivot) smallerCount++;
        }
        int correctIndex=low+smallerCount;
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
    public static void quicksort(int [] arr , int low ,int high,int k){
        if(low>high) return; // BASE CASE
        if(low==high){
           if(low==k-1) ans=arr[low];
           return;

        }
        int pivotIndex= partition(arr,low,high);
        if(pivotIndex==k-1) {
            ans=arr[pivotIndex];
            return;
        }
        if(pivotIndex>k-1)  quicksort(arr,low,pivotIndex-1,k);
        else quicksort(arr,pivotIndex+1,high,k);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of K ");
        int k=sc.nextInt();
        print(arr);
        ans=0;   // reinitialise the global variable
        quicksort(arr,0,n-1,k);
        System.out.println("The "+k+"th smallest element is : "+ans);

    }
}

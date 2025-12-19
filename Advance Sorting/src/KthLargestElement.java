import java.util.*;
public class KthLargestElement
{
    static int ans;
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[]arr,int low,int high){
        int pivot=arr[low];
        int pivotidx=low;
        int smallercount=0;
        for(int i=low+1;i<=high;i++){
            if(arr[i]<=pivot) smallercount++;
        }
        int correctidx=low+smallercount;
        swap(arr,pivotidx,correctidx);
        int i=low;
        int j=high;
        while(i<correctidx && j>correctidx){
            if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
                i++;
                j--;
            }
            if (arr[i]<=pivot) i++;
            if(arr[j]>pivot) j--;
        }
        return correctidx;
    }
    public static void quickSelect(int[]arr,int low,int high,int k){
        if(low>high) return ;  //BASE CASE
        if(low==high){
            if(low==k-1) ans= arr[low];
            return;
        }
        int idx=partition(arr, low, high);
        if(idx==k-1){
            ans= arr[idx];
            return;
        }
        if(idx>k-1) quickSelect(arr,low,idx-1,k);
        else quickSelect(arr,idx+1,high,k);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ans=0; // reinitialisation of global variable
        System.out.println("Enter the value of k i.e Kth largest : ");
        int k=sc.nextInt();
        int equivalentSmallest = n-k+1; //kth largest element ==(n-k+1)th smallest element
        quickSelect(arr,0,n-1,equivalentSmallest);
        System.out.println(ans);

    }
}

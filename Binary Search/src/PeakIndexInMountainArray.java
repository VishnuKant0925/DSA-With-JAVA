
import java.util.*;

public class PeakIndexInMountainArray
    {
        public static int Peak(int[]arr,int n){
            int low = 1;
            int high =n-2;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                    return mid;
                }else if(arr[mid]>arr[mid-1]&& arr[mid]<arr[mid+1]){
                    low=mid+1;
                }else if (arr[mid]<arr[mid-1]&& arr[mid]>arr[mid+1]){
                    high=mid-1;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i<n;i++){
                arr[i]=sc.nextInt();
            }
            int peak = Peak(arr,n);
            System.out.println(peak);

        }
    }


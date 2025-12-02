
import java.util.*;
public class  K_Closest_Element
{
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        if(x<arr[0]){
            for(int i =0; i<k;i++){
                ans.add(arr[i]);
            }
            return ans;
        }
        if(x>arr[n-1]){
            for(int i =n-k;i<n;i++){
                ans.add(arr[i]);
            }
            return ans;
        }
        int low=0;
        int high=n-1;
        int lb=n;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]>=x){
                lb=Math.min(lb,mid);
                high=mid-1;
            }else{
                low=mid+1;
            }

        }

        int i=lb-1;
        int j=lb;
        while(i>=0 && j<n && k>0){
            int di=Math.abs(x-arr[i]);
            int dj=Math.abs(x-arr[j]);
            if(di<=dj){
                ans.add(arr[i]);
                i--;
            }else{
                ans.add(arr[j]);
                j++;
            }
            k--;

        }
        while(i<0 && k>0){
            ans.add(arr[j]);
            j++;
            k--;
        }
        while(j==n && k>0){
            ans.add(arr[i]);
            i--;
            k--;
        }

        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array one by one : ");
        for(int i =0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter K : ");
        int k = sc.nextInt();
        System.out.println("Enter X : ");
        int x= sc.nextInt();

        System.out.println(findClosestElements(arr,k,x));

    }
}
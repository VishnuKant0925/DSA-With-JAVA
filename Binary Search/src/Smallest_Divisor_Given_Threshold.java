import java.util.*;
public class Smallest_Divisor_Given_Threshold {
    public static boolean isPossible(int[]arr,int div,int th){
            int n = arr.length;
            int sum=0;
            for(int i=0;i<n;i++){
                if(arr[i]%div==0) sum+=arr[i] / div;
                else sum+=arr[i] / div + 1;
            }
            if(sum<=th) return true;
            else return false;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();
            System.out.println("Enter the elements of array 1 by 1:");
            int[] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the threshold");
            int th=sc.nextInt();
            int mx=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                mx=Math.max(arr[i],mx);
            }
            int low=1;
            int high=mx;
            int ans=0;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(isPossible(arr,mid,th)){
                    ans=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            System.out.println("The answer is : "+ans);
    }
}


import java.util.*;
public class Capacity_To_Ship_Within_D_Days {

    public static boolean isPossible(int[] arr , int capacity , int days){
            int n = arr.length;
            int load=0;
            int day=1;
            for(int i=0;i<n;i++){
                if(load+arr[i]<=capacity) load+=arr[i];
                else{
                    load=arr[i];
                    day++;
                }
            }
            if(day<=days) return true;
            else return false;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Array Size: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the array element 1 by 1: ");
            for(int i =0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the number of days: ");
            int days=sc.nextInt();
            int max=Integer.MIN_VALUE;
            int sum=0;
            for(int i =0;i<n;i++){
                max=Math.max(max,arr[i]);
                sum+=arr[i];
            }

            int low=max;
            int high=sum;
            int minCapacity=0;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(isPossible(arr,mid,days)){
                    minCapacity=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            System.out.println(minCapacity);


    }
}


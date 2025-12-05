import java.util.*;
public class Minimized_Maximum_of_Product_Distributed {
    public static boolean isPossible(int[] arr,int maxQ,int stores){
            int n = arr.length;
            int store=0;
            for(int i=0;i<n;i++){
                if(arr[i]%maxQ==0) store+=arr[i]/maxQ;
                else store+=arr[i]/maxQ +1;
            }
            if(store<=stores) return true;
            else return false;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Stores: ");
            int stores = sc.nextInt();
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the element of array one by one: ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                max=Math.max(arr[i],max);
            }
            int low=1;
            int high=max;
            int ans=0;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(isPossible(arr,mid,stores)){
                    ans=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            System.out.println("Minimum no. of maximum product is :"+ans);
    }
}


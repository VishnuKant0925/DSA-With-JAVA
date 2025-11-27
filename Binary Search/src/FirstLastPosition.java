import java.util.Scanner;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] arr  = {10,10,10,10,20,20,20,20,20,30,30,30,40,40};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose position you want : ");
        int x = sc.nextInt();
        int n = arr.length;
        int low =0;
        int high =n-1;
        boolean flag = false;
        // search for the element exist or not using binary search

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                flag = true ;
                break;
            } else if (arr[mid]<x) {
                low=mid+1;
            } else if (arr[mid]>x) {
                high=mid-1;
            }
        }
        int[] ans = {-1,-1};
        if(!flag){
           for(int ele : ans){
               System.out.print(ele+" ");
           }
        }else{

            //finding the lower bound
             low = 0;
             high= arr.length-1;
            int lb= arr.length;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(arr[mid]==x){
                    lb=Math.min(lb,mid);
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            ans[0]=lb;

            //find upperbound
             low = 0;
             high= arr.length-1;
            int  ub= arr.length;
            while(low<=high){
                int mid =(low+high)/2;
                if(arr[mid]>x){
                    ub=Math.min(ub,mid);
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            ans[1]=ub-1;
        }

        //printing the ans

        for(int ele : ans){
            System.out.print(ele+" ");
        }

    }
}

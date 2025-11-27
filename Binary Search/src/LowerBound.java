import java.util.Scanner;

public class LowerBound {
    public static void main(String[] args) {
        int [] arr={10,20,30,30,40,50,60,70};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element:");
        int x = sc.nextInt();
        int low = 0;
        int high= arr.length-1;
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
        System.out.println(lb);
    }
}

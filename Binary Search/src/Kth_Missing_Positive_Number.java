import java.util.*;
public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array : ");
            int n= sc.nextInt();
            int [] arr = new int[n];
            System.out.println("Enter the elements of array: ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the value of K : ");
            int k= sc.nextInt();
            int low=0;
            int high=n-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                int missed = arr[mid]-(mid+1);
                if(missed<k) low=mid+1;
                else high=mid-1;
            }
            System.out.println(k+low);
        }
    }


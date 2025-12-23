
import java.util.*;

public class  First_Missing_Positive
{
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array : ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        while(i<n){
            int ele =arr[i];
            if(ele<=0 || ele>n || ele==arr[ele-1]||ele-1==i) i++;
            else{
                swap(arr,i,ele-1);
            }
        }
        boolean flag = false;
        for(i=0;i<n;i++){
            if(arr[i]!=i+1) {
                flag=true;
                System.out.println(i+1);
                break;
            }
        }
        if(!flag){
            System.out.println(n);
        }

    }
}
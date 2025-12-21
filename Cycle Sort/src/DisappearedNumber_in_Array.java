
import java.util.*;

class DisappearedNumber_in_Array
{
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of array in range[1,n] also write duplicate :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();

        int i=0;
        while(i<n){
            if(i==arr[i]-1 || arr[i]==arr[arr[i]-1]) i++;
            else swap(arr,i,arr[i]-1);
        }
        for(int j=0;j<n;j++){
            if(j!=arr[j]-1){
                ans.add(j+1);
            }
        }
        for( int j=0;j<ans.size();j++){
            System.out.print(ans.get(j)+" ");
        }
    }
}
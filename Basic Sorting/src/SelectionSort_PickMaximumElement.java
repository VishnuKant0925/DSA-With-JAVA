import java.util.Scanner;

public class SelectionSort_PickMaximumElement {
    public static  void swap(int[] arr , int i,int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=n-1;
        for(int i=0;i<n-1;i++){

            int max = Integer.MIN_VALUE;
            int maxidx=-1;
            for(int j=0;j<n-i;j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxidx=j;
                }
            }
            swap(arr,l,maxidx);
            l--;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}

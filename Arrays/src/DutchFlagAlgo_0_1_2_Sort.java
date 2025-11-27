public class DutchFlagAlgo_0_1_2_Sort {
    public static void main(String[] args) {
        int[] arr={0,0,2,1,0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{  //arr[mid]==2;
                swap(arr,mid,high);
                high--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

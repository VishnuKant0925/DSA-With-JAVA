public class SortZeroOne {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0};
        int n = arr.length;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(i<j && arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}

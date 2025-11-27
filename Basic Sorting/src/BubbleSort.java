public class BubbleSort {
    public static  void print(int[]arr){
        for( int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {3,1,2,5,-4};
        int n = arr.length;
        print(arr);

        //bubble sort 1

//        for(int j=1;j<=n-1;j++){
//            for (int i = 0; i < n - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
 //        }

        //Bubble Sort 2

//        for(int j=0;j<n-1;j++){
//            for (int i = 0; i < n-1-j; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }

        //Bubble Sort ---->>> OPTIMIZED
        for(int j=0;j<n-1;j++){  //N-1 PASS
            for (int i = 0; i < n-1-j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            //Check if this pass has sorted array or not
            boolean flag = true;
            for(int i=0; i<=n-2;i++) {
                if (arr[i] > arr[i+1]) {
                    flag = false;
                    break;
                }
            }
            if(flag) break;
        }
        print(arr);
    }
}

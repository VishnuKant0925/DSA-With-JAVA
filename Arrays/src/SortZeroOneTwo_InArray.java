public class SortZeroOneTwo_InArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 2, 1, 2, 1, 2, 1, 0, 2, 0, 0, 1, 2, 0};
        int n = arr.length;
        int NoOfZeroes = 0;
        int NoOfOnes =0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0){
                NoOfZeroes++;
            }
            else if (arr[i]==1) {
                NoOfOnes++;
            }
        }
        //int NoOfTwos= n-(NoOfOnes+NoOfZeroes);

        for (int i = 0; i < n; i++) {
            if (i < NoOfZeroes) {
                arr[i] = 0;
            } else if(i<NoOfOnes+NoOfZeroes) {
                arr[i] = 1;
            }else{
                arr[i]=2;
            }
        }
        System.out.println();
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}

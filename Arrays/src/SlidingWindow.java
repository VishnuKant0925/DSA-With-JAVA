public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr ={5,2,3,1,5,6,3,2,4};
        int n = arr.length;
        int k =3;
        int currSum=0;
        for(int i=0;i<k;i++){
            currSum+=arr[i];
        }
        int maxSum= currSum;
        for(int i=k;i<n;i++){
            currSum+=arr[i];
            currSum-=arr[i-k];
            if(currSum>maxSum){
                maxSum=currSum;
            }    
        }

        System.out.println(maxSum);

    }
}

public class ReverseArrayUsingTwoPointer {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int i=0;
        int j=n-1;

         //i= 1, j=5   part of array reverse
        while(i<=j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}

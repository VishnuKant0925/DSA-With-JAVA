public class LargestElement {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{56,78,90,87},{100,909,897,76}};
        int m = arr.length;
        int n= arr[0].length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<m;i++){   //rows
            for(int j=0;j<n;j++){    //columns
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }

        }
        System.out.println("Max is :"+max);

    }
}

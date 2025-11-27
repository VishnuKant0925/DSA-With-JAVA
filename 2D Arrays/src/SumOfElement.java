public class SumOfElement {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{56,78,90,87},{100,909,897,76}};
        int m = arr.length;
        int n= arr[0].length;
        int sum = 0 ;
        for(int i=0;i<m;i++){   //rows
            for(int j=0;j<n;j++){    //columns
                sum+=arr[i][j];
            }

        }
        System.out.println("Sum is :"+sum);

    }
}

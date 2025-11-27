public class RotateBy90 {
    public static void Print(int[][] arr){
        int m =arr.length;
        int n = arr[0].length;
        for(int i =0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        int m =arr.length;
        int n = arr[0].length;
        Print(arr);
        //Transpose of Matrix
        for(int i =0 ; i<m ; i++){
            for(int j=0 ; j<i ; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        Print(arr);
        //Reverse Each row
        for(int i =0 ; i<m ; i++){  //row
            int low =0; int high = n-1;
            for(int j=0 ; j<n/2 ; j++){ //col
                int temp = arr[i][low];
                arr[i][low]=arr[i][high];
                arr[i][high]=temp;
                low++;
                high--;

            }
        }
        Print(arr);
    }
}

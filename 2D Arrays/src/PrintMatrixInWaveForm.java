public class PrintMatrixInWaveForm {
    public static void main(String[] args) {
        int [][] arr ={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int m =arr.length;
        int n = arr[0].length;
        for(int i =0 ; i<m ; i++){
            int p =n-1;
            for(int j=0 ; j<n ; j++){
                if(i%2==0) {
                    System.out.print(arr[i][j] + " ");
                }else{

                    System.out.print(arr[i][p]+" ");
                    p--;
                }
            }
            System.out.println();
        }
    }
}

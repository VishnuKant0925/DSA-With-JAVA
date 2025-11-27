public class SpiralMatrix {
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
        int [][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int m = arr.length;
        int n = arr[0].length;
        Print(arr);
        int min_r=0 , max_r = m-1 , min_c = 0, max_c = n-1;
        while(min_r<=max_r && min_c<=max_c){
            //left to right
            for(int j=min_c;j<=max_c;j++){
                System.out.print(arr[min_r][j]+" ");
            }
            min_r++;
            //top to bottom
            if(min_r>max_r || min_c>max_c) break;
            for(int i = min_r ; i<=max_r;i++){
                System.out.print(arr[i][max_c]+" ");
            }
            max_c--;
            //right to left
            if(min_r>max_r || min_c>max_c) break;
            for(int j=max_c;j>=min_c;j--){
                System.out.print(arr[max_r][j]+" ");
            }
            max_r--;
            //bottom to top
            if(min_r>max_r || min_c>max_c) break;
            for(int i = max_r ; i>=min_r ; i--){
                System.out.print(arr[i][min_c]+" ");
            }
            min_c++;
        }
    }
}

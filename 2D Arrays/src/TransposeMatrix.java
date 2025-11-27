public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4},{5,6}};
        int n = arr.length;
        int m = arr[0].length;

        //transpose i.e column wise printing
        for(int j=0;j<m;j++){
            for(int i =0;i<n;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int [][] transpose = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                transpose[i][j]=arr[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}

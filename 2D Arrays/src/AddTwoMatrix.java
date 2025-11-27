public class AddTwoMatrix {
    public static void main(String[] args) {
        int [][] a = {{1,2,3,4},{10,20,30,40}};
        int [][] b = {{5,6,7,8},{50,60,70,80}};
        int m = a.length;
        int n = b[0].length;
        int [][] res = new int[m][n];
        for(int i= 0; i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i= 0; i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}

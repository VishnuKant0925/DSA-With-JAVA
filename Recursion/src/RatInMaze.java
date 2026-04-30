public class RatInMaze {
    public static void Path(int i, int j,int n,int[][] maze,String p){
        if(i==n-1 && j==n-1){
            System.out.println(p);
            return;
        }
        if(i+1<n && maze[i+1][j]==1){  //move down
            Path(i+1,j,n,maze,p+"D");
        }
        if(j+1<n && maze[i][j+1]==1){  // move right
            Path(i,j+1,n,maze,p+"R");
        }
    }
    public static void main(String[] args) {
         int[][] maze ={{1,1,0,0},{1,1,0,0},{0,1,1,1},{0,1,0,1}};
         Path(0,0,4,maze,"");

    }
}

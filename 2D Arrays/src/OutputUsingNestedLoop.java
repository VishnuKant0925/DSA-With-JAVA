import java.util.Scanner;

public class OutputUsingNestedLoop {
    public static void main(String[] args) {

        int [][] arr = new int[2][3];

        Scanner sc = new Scanner(System.in);
        int m = arr.length;  //no.of rows
        int n = arr[0].length; // no. of columns

        System.out.println(m+"  "+n);
        // input of 2D Array
        for(int i=0;i<2;i++){   //rows
            for(int j=0;j<3;j++){    //columns
               arr[i][j]=sc.nextInt();
            }

        }
       // Output of 2D Array
       for(int i=0;i<2;i++){   //rows
           for(int j=0;j<3;j++){    //columns
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
    }
}

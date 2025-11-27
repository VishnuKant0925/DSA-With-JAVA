import java.util.*;
public class RankElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n ;i++){
            arr[i]=sc.nextInt();
        }
        for(int ele : arr){

            System.out.print(ele+" ");
        }
        System.out.println();
        int x=0;
        for(int i=0 ;i<n;i++){
            int min = Integer.MAX_VALUE;
            int minidx= -1;
            for(int j=0;j<n;j++){
                if(arr[j]< min && arr[j]!=0 && arr[j]>0){
                    min=arr[j];
                    minidx=j;
                }
            }
            arr[minidx]=x;
            x--;

        }

        for(int ele : arr){
            ele = ele*-1;
            System.out.print(ele+" ");
        }
    }
}

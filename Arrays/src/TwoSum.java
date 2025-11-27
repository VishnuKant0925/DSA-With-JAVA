import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr={2,9,4,5,6,3,9,-3,0,7};
        System.out.println("Enter the sum (X) value :");
        int x= sc.nextInt();
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+"  "+arr[j]);
                }
            }
        }
    }
}

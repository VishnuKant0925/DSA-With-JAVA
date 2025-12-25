import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr={1,2,4,3,5,6,7,3,4,8,5,2,3,6,8,9};
        int  n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X: ");
        int x= sc.nextInt();
        int count=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==x) {
                        count++;
                        System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"="+x);
                    }
                }
            }
        }
    }
}

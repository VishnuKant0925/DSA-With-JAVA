import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array : ");
        int n =sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean flag=true;
            for(int j=0;j<n;j++){
                if(i!=j && arr[i]==arr[j]){
                    flag=false;
                    break;
                }

            }
            if(flag) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

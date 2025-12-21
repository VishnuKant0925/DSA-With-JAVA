import java.util.*;

class DuplicateNumber
{
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter (n+1) elements : ");
        for(int i=0;i<n+1;i++){
            arr[i]=sc.nextInt();
        }
        int duplicate;
        while(true){
            int ele =arr[0];
            if(arr[ele]==ele){
                duplicate=ele;
                break;
            }
            swap(arr,0,ele);
        }
        System.out.print("The duplicate element is : "+duplicate);
    }
}

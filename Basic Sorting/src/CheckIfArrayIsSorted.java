public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,7,10};
        int n = arr.length;
        int j=1;
        boolean flag = true;
        for(int i=0; i<=n-2;i++){
            if(arr[i]>arr[j]){
                flag=false;
                break;
            }else if(arr[i]<arr[j]){
                j++;
            }
        }

        if(flag){
            System.out.println("Array is  sorted ");
        }else{
            System.out.println("Array is not sorted ");
        }


    }
}

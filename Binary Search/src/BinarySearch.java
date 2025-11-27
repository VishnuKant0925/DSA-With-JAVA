public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {10,23,46,89,91,97,107,140,264};
        int n = arr.length;
        int target = 140;
        int low = 0 , hi = n-1;
        boolean flag = false ; // false means not present
        int mid= (low+hi)/2;
        while(low<=hi){
              mid= (low+hi)/2;
            if(arr[mid]==target){
                flag= true;
                break;
            } else if (arr[mid]<target) {
                low=mid+1;
            }else if (arr[mid]>target){
                hi=mid-1;
            }
        }
        if(flag){
            System.out.println("FOUND : "+target+" at "+mid);
        }else{
            System.out.println("NOT FOUND ");
        }
    }
}

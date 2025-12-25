public class Palindrome_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1,1};
        int n= arr.length;
        int i=0;
        int j=n-1;
        boolean flag=true;
        while(i<n){
            if(arr[i]!=arr[j]){
                flag=false;
                break;
            }else{
                i++;
                j--;
            }
        }
        if(flag) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}

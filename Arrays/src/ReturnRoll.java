public class ReturnRoll {
    public static void main(String[] args) {
        int [] arr = {76,34,45,76,23,17,53,90,30,67,89,10};
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<35){
                System.out.println("Roll no : "+i);
            }
        }
    }
}

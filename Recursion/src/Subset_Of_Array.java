import java.util.ArrayList;

public class Subset_Of_Array {
  static   ArrayList<Integer> ans = new ArrayList<>();
    public static void subset(int[] arr,int i){
        if(i==arr.length){
            System.out.println(ans);
            return;
        }
        int x=arr[i];
        subset(arr,i+1);
        ans.add(x);
        subset(arr,i+1);
        ans.remove(ans.size()-1);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3};
        subset(arr,0);
    }
}

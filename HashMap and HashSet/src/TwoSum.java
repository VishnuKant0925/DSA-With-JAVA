import java.util.*;
import java.lang.*;
import java.io.*;

public class TwoSum
{
    public static int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int[] ans = {-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int remaining = target - arr[i];
            if(map.containsKey(remaining)){
                int j = map.get(remaining); // find index of remaining value
                ans[0]=j;
                ans[1]=i;
                break;
            }
            else{
                map.put(arr[i],i);
            }
        }
        return ans;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = twoSum(arr,target);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}

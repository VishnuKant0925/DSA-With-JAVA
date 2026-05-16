

import java.util.*;
import java.lang.*;
import java.io.*;


public class SlidingWindowMax
{
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        int resi=0;
        Deque<Integer> q = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            while(!q.isEmpty() && q.peek() < i-k+1){ // remove out of window element
                q.removeFirst();
            }

            // remove smaller element from right hand side

            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.removeLast();
            }
            q.addLast(i);
            if(i>=k-1){
                res[resi++]=nums[q.peek()];
            }
        }
        return res;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        int[] res = maxSlidingWindow(nums,k);
        for(int x : res){
            System.out.print(x+" ");
        }
    }
}

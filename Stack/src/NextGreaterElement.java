

import java.util.*;
import java.lang.*;
import java.io.*;


public class NextGreaterElement
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            ans[i]=-1;
        }
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]) st.pop();
            ans[i] = st.isEmpty()?-1 : st.peek();
            st.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}


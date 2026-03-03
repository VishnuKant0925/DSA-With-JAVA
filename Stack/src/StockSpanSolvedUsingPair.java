import java.util.ArrayList;
import java.util.Stack;

public class StockSpanSolvedUsingPair {
    static class pair{
        int val;
        int index;
        pair(int val , int index){
            this.val = val;
            this.index = index;
        }
    }
    public static void calculateSpan(int[] arr) {
        Stack<pair> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        ans[0]=1;
        st.push(new pair(arr[0],0));
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && st.peek().val<=arr[i]) st.pop();
            if(st.isEmpty()) ans[i]= i+1;
            else ans[i]= i-st.peek().index;
            st.push(new pair(arr[i],i));
        }

        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

    }
    public static void main(String[] args) {
         int[] stocks ={100,80,90,120};
         calculateSpan(stocks);
    }
}

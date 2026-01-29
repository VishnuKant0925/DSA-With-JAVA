import java.util.Stack;
import java.util.Scanner;
public class ReverseStackRecursive {
    public static void displayRecursive( Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRecursive(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack");
        int n = sc.nextInt();
        System.out.println("Enter stack elements ");
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=n;i++){
            st.push(sc.nextInt());
        }
        displayRecursive(st);
    }
}

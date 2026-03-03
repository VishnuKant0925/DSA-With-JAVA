import java.util.Scanner;
import java.util.Stack;

public class PushElementAtBottomRecursively {
    public static void pushBottom(Stack<Integer> st , int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushBottom(st,ele);
        st.push(top);

    }
    public static void reverse(Stack<Integer> st ){
        if(st.size()==1) return;
        int top = st.pop();
        reverse(st);
        pushBottom(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer> sb_Original = new Stack<>();
        sb_Original.push(10);
        sb_Original.push(20);
        sb_Original.push(30);
        sb_Original.push(40);
        sb_Original.push(50);
        System.out.println(sb_Original);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ele ");
        int ele = sc.nextInt();
        pushBottom(sb_Original,ele);
        System.out.println(sb_Original);
        reverse(sb_Original);
        System.out.println(sb_Original);
    }
}

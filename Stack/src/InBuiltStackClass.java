import java.util.Stack;
public class InBuiltStackClass {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.size());
        st.push(40);
        st.push(39);

        // to access first element inserted in stack

        while(st.size() > 1){
            st.pop();
        }
        // size becomes 1;
        System.out.println(st.peek());
    }
}

import java.util.Stack;
public class ReverseStack {
    public static void main(String[] args) {
        Stack <Integer> sb_Original = new Stack<>();
        sb_Original.push(10);
        sb_Original.push(20);
        sb_Original.push(30);
        sb_Original.push(40);
        System.out.println(sb_Original);

        // reversing above stack

        Stack<Integer> sb_Reversed = new Stack<>();

        while(!sb_Original.empty()){
            int ele = sb_Original.pop();
            sb_Reversed.push(ele);
        }

        System.out.println(sb_Reversed);
    }
}

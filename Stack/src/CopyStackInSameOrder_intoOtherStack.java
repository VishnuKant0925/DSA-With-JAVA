import java.util.Stack;

public class CopyStackInSameOrder_intoOtherStack {
    public static void main(String[] args) {
        Stack<Integer> sb_Original = new Stack<>();
        sb_Original.push(10);
        sb_Original.push(20);
        sb_Original.push(30);
        sb_Original.push(40);
        System.out.println(sb_Original);
        // reversing above stack and storing into temp
        Stack<Integer> temp = new Stack<>();
        while(!sb_Original.empty()){
            int ele = sb_Original.pop();
            temp.push(ele);
        }
        System.out.println(temp);
        //copying
        Stack<Integer> copiedStack = new Stack<>();
        while(!temp.empty()){
            int ele = temp.pop();
            copiedStack.push(ele);
        }
        System.out.println(copiedStack);

    }
}

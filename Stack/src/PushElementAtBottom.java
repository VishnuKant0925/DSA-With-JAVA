import java.util.Stack;

public class PushElementAtBottom {
    public static void main(String[] args) {
        Stack<Integer> sb_Original = new Stack<>();
        sb_Original.push(10);
        sb_Original.push(20);
        sb_Original.push(30);
        sb_Original.push(40);
        sb_Original.push(50);
        System.out.println(sb_Original);
        // reversing above stack and storing into temp
        Stack<Integer> temp = new Stack<>();
        while(!sb_Original.empty()){
            int ele = sb_Original.pop();
            temp.push(ele);
        }
        //insert at bottom
        temp.push(5);  //let new element is 5

        //copying back to original array
        while(!temp.empty()){
            int ele = temp.pop();
            sb_Original.push(ele);
        }
        System.out.println(sb_Original);
    }
}

import java.util.Scanner;
import java.util.Stack;

public class InsertElementAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> sb_Original = new Stack<>();
        sb_Original.push(10);
        sb_Original.push(20);
        sb_Original.push(30);
        sb_Original.push(40);
        sb_Original.push(50);
        System.out.println(sb_Original);
        System.out.println("ENTER INDEX AND ELEMENT");
        int idx = sc.nextInt();
        int ele = sc.nextInt();
        // reversing above stack and storing into temp
        Stack<Integer> temp = new Stack<>();
        while(sb_Original.size()>=idx){
            int val = sb_Original.pop();
            temp.push(val);
        }
        sb_Original.push(ele);
        //copying back to original array
        while(!temp.empty()){
            int val = temp.pop();
            sb_Original.push(val);
        }
        System.out.println(sb_Original);
    }
}

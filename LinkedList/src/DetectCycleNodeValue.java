
import java.util.*;

 public class DetectCycleNodeValue {

    // Definition of ListNode
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Function to detect cycle and return starting node value
    public static int cycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                break;
        }

        // No cycle
        if (fast == null || fast.next == null)
            return -1;

        // Step 2: Find cycle starting node
        while (slow != temp) {
            slow = slow.next;
            temp = temp.next;
        }

        return slow.val;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Linked list is empty");
            return;
        }

        System.out.println("Enter node values:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter position to create cycle (-1 for no cycle):");
        int pos = sc.nextInt();

        // Create linked list
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        ListNode cycleNode = null;

        for (int i = 1; i < n; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;

            if (i == pos) {
                cycleNode = curr;
            }
        }

        // Create cycle only if pos != -1
        if (pos != -1) {
            if (pos == 0)
                curr.next = head;
            else
                curr.next = cycleNode;
        }

        // Detect cycle
        int result = cycle(head);

        System.out.println("Result:");
        if (result == -1) {
            System.out.println("No cycle detected (null)");
        } else {
            System.out.println("Cycle starts at node with value: " + result);
        }
    }
}

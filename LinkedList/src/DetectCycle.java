
import java.util.*;
import java.lang.*;
import java.io.*;

public class DetectCycle {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Function to detect cycle (Floyd’s Algorithm)
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // cycle found
            }
        }
        return false; // no cycle
    }

    public static void main (String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        // Read number of nodes
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(false);
            return;
        }
        System.out.println("Enter the node values : ");
        // Read node values
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the pos index ie. index at which cycle began");
        // Read pos
        int pos = sc.nextInt();

        // Create linked list
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        ListNode cycleNode = null;

        if (pos == 0) {
            cycleNode = head;
        }

        for (int i = 1; i < n; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;

            if (i == pos) {
                cycleNode = curr;
            }
        }

        // Create cycle if pos != -1
        if (pos != -1) {
            curr.next = cycleNode;
        }

        // Check cycle
        boolean result = hasCycle(head);

        // Output result
        System.out.println(result);
    }
}



public class Main {
    public static void main(String[] args) {
        // Example 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        ListNode swapped1 = solution.swapNodes(head1, 2);
        printLinkedList(swapped1);  // Output: 1 -> 4 -> 3 -> 2 -> 5

        // Example 2
        ListNode head2 = new ListNode(7);
        head2.next = new ListNode(9);
        head2.next.next = new ListNode(6);
        head2.next.next.next = new ListNode(6);
        head2.next.next.next.next = new ListNode(7);
        head2.next.next.next.next.next = new ListNode(8);
        head2.next.next.next.next.next.next = new ListNode(3);
        head2.next.next.next.next.next.next.next = new ListNode(0);
        head2.next.next.next.next.next.next.next.next = new ListNode(9);
        head2.next.next.next.next.next.next.next.next.next = new ListNode(5);

        ListNode swapped2 = solution.swapNodes(head2, 5);
        printLinkedList(swapped2);  // Output: 7 -> 9 -> 6 -> 6 -> 8 -> 7 -> 3 -> 0 -> 9 -> 5
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

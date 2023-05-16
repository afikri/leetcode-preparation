public class Main {
    public static void main(String[] args) {
        // Create the linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Swap the pairs in the linked list
        ListNode swappedHead = solution.swapPairs(head);

        // Print the swapped linked list
        printLinkedList(swappedHead);
    }

    // Helper method to print the linked list
    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

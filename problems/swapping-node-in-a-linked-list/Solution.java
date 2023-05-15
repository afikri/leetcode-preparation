class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move the fast pointer to the kth node from the beginning
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        ListNode firstNode = fast;

        // Move the fast and slow pointers simultaneously until the fast pointer reaches the end
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        ListNode secondNode = slow.next;

        // Swap the values of the first and second nodes
        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;

        return dummy.next;
    }
}

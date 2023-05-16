// Definition for singly-linked list.
class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

class Solution {
  public ListNode swapPairs(ListNode head) {
    // If the list is empty or contains only one node, no swapping needed
    if (head == null || head.next == null) {
      return head;
    }

    // Create a dummy node to handle the edge case
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    // Initialize the previous and current nodes
    ListNode prev = dummy;
    ListNode curr = head;

    while (curr != null && curr.next != null) {
      // Nodes to be swapped
      ListNode firstNode = curr;
      ListNode secondNode = curr.next;

      // Swapping
      prev.next = secondNode;
      firstNode.next = secondNode.next;
      secondNode.next = firstNode;

      // Update the previous and current nodes for the next iteration
      prev = firstNode;
      curr = firstNode.next;
    }

    // Return the head of the modified list
    return dummy.next;
  }
}

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
  public int pairSum(ListNode head) {
      int[] values = new int[100001]; // The range of node values is from 1 to 10^5
      ListNode current = head;
      int n = 0; // Number of nodes
      
      // Store the values of the linked list nodes in the array
      while (current != null) {
          values[n++] = current.val;
          current = current.next;
      }
      
      int maxTwinSum = 0;
      
      // Calculate twin sum for each pair of nodes
      for (int i = 0; i < n / 2; i++) {
          int twinSum = values[i] + values[n - 1 - i];
          maxTwinSum = Math.max(maxTwinSum, twinSum);
      }
      
      return maxTwinSum;
  }
}
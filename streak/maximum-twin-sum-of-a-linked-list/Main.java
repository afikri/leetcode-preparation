public class Main {
  public static void main(String[] args) {
      // Test case 1
      ListNode node1 = new ListNode(5);
      ListNode node2 = new ListNode(4);
      ListNode node3 = new ListNode(2);
      ListNode node4 = new ListNode(1);
      node1.next = node2;
      node2.next = node3;
      node3.next = node4;
      Solution solution = new Solution();
      int maxTwinSum = solution.pairSum(node1);
      System.out.println(maxTwinSum);  // Output: 6
      
      // Test case 2
      ListNode node5 = new ListNode(4);
      ListNode node6 = new ListNode(2);
      ListNode node7 = new ListNode(2);
      ListNode node8 = new ListNode(3);
      node5.next = node6;
      node6.next = node7;
      node7.next = node8;
      maxTwinSum = solution.pairSum(node5);
      System.out.println(maxTwinSum);  // Output: 7
      
      // Test case 3
      ListNode node9 = new ListNode(1);
      ListNode node10 = new ListNode(100000);
      node9.next = node10;
      maxTwinSum = solution.pairSum(node9);
      System.out.println(maxTwinSum);  // Output: 100001
  }
}

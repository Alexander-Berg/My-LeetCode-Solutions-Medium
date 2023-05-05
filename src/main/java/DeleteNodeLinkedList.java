public class DeleteNodeLinkedList {

      //Definition for singly-linked list.
      public static class ListNode {
          public int val;
          public ListNode next;
          public ListNode(int x) { val = x; }
      }

    public static class Solution {
        public void deleteNode(ListNode node) {
            node.val=node.next.val;
            node.next=node.next.next;
        }
    }
}

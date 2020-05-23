/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode middleNode = head;
        int totalNodes = 0;
        while(head.next != null){
            totalNodes++;
            head = head.next;
        }
        int middleNodeNum = (totalNodes + 1) / 2;
        for(int i = 0; i < middleNodeNum; i++){
            middleNode= middleNode.next;
        }
        return middleNode;
    }
}

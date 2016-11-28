/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        if(k == 0) return head;
        int length = 1;
        ListNode currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
            length++;
        }
        currNode.next = head;
    
        k = k % length;
        for(int i = 0; i < length - k; i++){
            currNode = currNode.next;
        }
        head = currNode.next;
        currNode.next = null;
        
        return head;
    }
    
}

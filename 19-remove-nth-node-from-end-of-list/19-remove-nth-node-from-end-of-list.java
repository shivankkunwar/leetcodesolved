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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int counter = 0;
        ListNode p0 = head;
        int total = 0;
        while(p0!=null){
            p0 = p0.next;
            total++;
        }
        p0 = head;
        ListNode p1 = null;
        int target = total-n;
        if(target==0){
            return head.next;
        }
        while(counter<target){
            p1 = p0;
            p0 = p0.next;
            counter++;
        }
        p1.next = p0.next;
        return head;
        
    }
}
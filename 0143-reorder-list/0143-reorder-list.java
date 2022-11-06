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
    public void reorderList(ListNode head) {
    
        ListNode one =head;
        ListNode two=midAF(head);
        two=reverse(two);
        
        while(one!=null&&two!=null){
            ListNode o=one.next;
            ListNode t=two.next;
            
            one.next=two;
            two.next=o;
            one=o;
            two=t;
        }
        
        
        
    }
    public ListNode reverse(ListNode temp){
        ListNode curr=temp;
        ListNode prev=null;
        
        while(curr!=null){
            ListNode mid=curr.next;
            curr.next=prev;
            prev=curr;
            curr=mid;
        }
        return prev;
            
    }
    public ListNode midAF(ListNode temp){
        ListNode slow=temp;
        ListNode fast=temp;
        
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode ret=slow.next;
        slow.next=null;
        return ret;
    }
}
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
        ListNode temp=new ListNode(-1);
        temp.next=head;
        ListNode one=temp;
         ListNode two=temp;
        
       while(n--!=0){
          
            two=two.next;
            
        }
        while(two.next!=null){
            one=one.next;
            two=two.next;
        }
         
        one.next=one.next.next;
        return temp.next;
        
    }
}
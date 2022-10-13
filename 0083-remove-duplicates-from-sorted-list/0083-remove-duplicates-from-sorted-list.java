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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode  prev=null;
        ListNode temp=head;
        while(temp!=null){
            if(prev==null){
                    prev=temp;
                
            }else{
                
                if(prev.val==temp.val){
                    prev.next=temp.next;
                    temp=temp.next;
                }else{
                    prev=temp;
                    temp=temp.next;
                    
                }
                
                
            }
        }
        return head;
    }
    
}
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans= new ListNode(100);
        ListNode mid=ans;
        
        ListNode one=l1;
        ListNode two=l2;
        
        while(one!=null&&two!=null)
        {
            if(one.val<two.val){
                mid.next=one;
                mid=mid.next;
                one=one.next;
            }
           else{
               mid.next=two;
               mid=mid.next;
               two=two.next;
           }
                 
        }
        
        while(one!=null){
            mid.next=one;
            mid=mid.next;
            one=one.next;
            
        }
        
        while(two!=null){
            mid.next=two;
            mid=mid.next;
            two=two.next;
        }
    
        ans=ans.next;
        return ans;
    
    }
}
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans=new ListNode(100);
        ListNode temp=ans;
        
        ListNode one=list1;
        ListNode two= list2;
        
        while(one!=null&&two!=null&&temp!=null){
            if(one.val<=two.val){
                temp.next=one;
                temp=temp.next;
                one=one.next;
            }else{

                temp.next=two;
                temp=temp.next;
                two=two.next;
                
            }
        }
        
        while(one!=null){
            temp.next=one;
            temp=temp.next;
            one=one.next;
        }
         while(two!=null){
            temp.next=two;
            temp=temp.next;
            two=two.next;
        }
        
        ans=ans.next;
        
        return ans;
        
        
    }
}
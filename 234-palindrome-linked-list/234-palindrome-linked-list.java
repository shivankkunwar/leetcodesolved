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
    public boolean isPalindrome(ListNode head) {
        
        ArrayList<Integer> arr= new ArrayList<>();
        
        
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        int n=arr.size();
        int start=0;
        int end=n-1;
        while(start<end){
            if(arr.get(start)!=arr.get(end))return false;
            start++;
            end--;
            
        }
        return true;
    }
}
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prevgroup=dummy;
        while(true){
            ListNode kth=prevgroup;
            for(int i=0;i<k;i++){
                kth=kth.next;
                if(kth==null){
                    return dummy.next;
                }
            }
            ListNode groupnext=kth.next;
            ListNode prev=groupnext;
            ListNode curr=prevgroup.next;
            while(curr!=groupnext){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            ListNode temp=prevgroup.next;
            prevgroup.next=kth;
            prevgroup=temp;
        }
    }
}

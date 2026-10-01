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
    public ListNode reverseList(ListNode head) {
        ListNode curr,prev,nextt;
        prev=null;
        curr=head;
        nextt=null;
        while(curr!=null){
            nextt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextt;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode rev=reverseList(head);
        ListNode temp=rev;
        int carry=0;
        int b=0;
        ListNode start=new ListNode(0);
        ListNode out=start;
        while(temp!=null){
            int ans=temp.val*2+carry;
            if(ans>9){
                carry=ans/10;
                b=ans%10;
            }
            else{
                carry=0;
                b=ans;
            }
            start.next=new ListNode(b);
            start=start.next;
            temp=temp.next;
        }
        if(carry!=0){
            start.next=new ListNode(carry);
        }

        return reverseList(out.next);
    }
}
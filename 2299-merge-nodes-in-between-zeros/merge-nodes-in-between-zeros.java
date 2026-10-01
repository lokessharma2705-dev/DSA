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
    public ListNode mergeNodes(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val==0){
                count++;
            }
            temp=temp.next;
        }
        int sum=0;
        ListNode temp1=head,temp2=head.next;
        ListNode start=new ListNode(0);
        ListNode ans=start;
        while(count!=1){
            while(temp2.val!=0){
                sum=sum+temp2.val;
                temp2=temp2.next;
            }
            start.next=new ListNode(sum);
            start=start.next;
            sum=0;
            temp1=temp2;
            temp2=temp2.next;
            count--;
        }
        return ans.next;
    }
}
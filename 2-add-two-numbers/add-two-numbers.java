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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int count1=0;
        int count2=0;
        ListNode temp1=l1,temp2=l2;
        while(temp1.next!=null){
            count1++;
            temp1=temp1.next;
        }
        while(temp2.next!=null){
            count2++;
            temp2=temp2.next;
        }
        if(count1>count2){
            int diff=count1-count2;
            while(diff!=0){
                temp2.next=new ListNode(0);
                temp2=temp2.next;
                diff--;
            }
        }
        if(count1<count2){
            int diff=count2-count1;
            while(diff!=0){
                temp1.next=new ListNode(0);
                temp1=temp1.next;
                diff--;
            }
        }


        temp1=l1;
        temp2=l2;
        int carry=0;
        int b=0;
        ListNode start=new ListNode(0);
        ListNode out=start;
        while(temp1!=null&&temp2!=null){
            int ans=temp1.val+temp2.val+carry;
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
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(carry!=0){
            start.next=new ListNode(carry);
        }
        return out.next;
    }
}
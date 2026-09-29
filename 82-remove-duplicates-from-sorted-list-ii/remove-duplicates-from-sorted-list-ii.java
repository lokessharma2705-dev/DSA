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
        if (head == null) return null;
        ListNode temp=head.next,prev=head;
        Set<Integer> list=new HashSet<>();
        while(temp!=null){
            if(prev.val==temp.val){
                list.add(prev.val);
                prev.next=temp.next;
            }
              prev=temp;
              temp=temp.next;
        }
        ListNode start=new ListNode(-1);
        start.next=head;
        temp=start;
        while(temp.next!=null){
            if(list.contains(temp.next.val)){
                temp.next=temp.next.next;
            }
            else
            temp=temp.next;
        }
        return start.next;
    }
}
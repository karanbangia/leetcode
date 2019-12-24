/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
        {
            return null;
        }
        ListNode pass=head;
        int count=0;
        while(pass!=null)
        {
            pass=pass.next;
            count++;
        }
        if(count==n)
        {
            return head.next;
        }
        ListNode ptr_1=head;
        ListNode ptr_2=head;
        for(int i=0;i<=n;i++)
        {
            ptr_2=ptr_2.next;
        }
        while(ptr_2!=null)
        {
            ptr_2=ptr_2.next;
            ptr_1=ptr_1.next;
        }
        ptr_1.next=ptr_1.next.next;
        return head;
    }
}
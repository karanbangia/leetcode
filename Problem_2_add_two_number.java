/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode s1=new ListNode(0);
        int c=0;
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode curr=s1;
        while(p1!=null || p2!=null)
        {
           int a1=(p1!=null) ? p1.val :0;
           int a2=(p2!=null) ? p2.val :0;
           int sum=a1+a2+c;
           c=sum/10;
           sum=sum%10;
           curr.next=new ListNode(sum);
           curr=curr.next;
           if(p1 != null) p1=p1.next;
           if(p2 != null) p2=p2.next;
                           
            
        }
        if(c>0)
        {
            curr.next=new ListNode(c);
        }
        return s1.next;
        
    }
}
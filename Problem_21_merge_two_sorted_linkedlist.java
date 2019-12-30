/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
       if(l1==null)return l2;
       if(l2==null)return l1;
       ListNode ll=new ListNode(-1);
       ListNode temp=ll;
       while(l1!=null && l2!=null)
       {
           if(l1.val<=l2.val)
           {
               ll.next=l1;
               l1=l1.next;
           }
           else
           {
               ll.next=l2;
               l2=l2.next;
           }
           ll=ll.next;
       }
        if(l1!=null)
        {
            ll.next=l1;
        }
        else
        {
            ll.next=l2;
        }
       return temp.next;
    }
}
   
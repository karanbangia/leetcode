/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//basic solution
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
   
//recursion solution
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
        if(l1.val<=l2.val)
        {
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
        else
        {
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}
   
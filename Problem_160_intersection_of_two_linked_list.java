/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//giving error as modification fo linked lsit is not alllowed
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        while(temp!=null)
        {
            temp.val=-temp.val;
            temp=temp.next;
        }
        ListNode temp2=headB;
        ListNode x=null;
        int count=0;
        while(temp2!=null)
        {
            if(temp2.val<0)
            {
                temp2.val=-temp2.val;
                count+=1;
                if(count==1)
                {
                 x=temp2;
                }
            }
            else
            {
                temp2=temp2.next;
            }
        }
        return x;
    }
}
//accepted
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private int length(ListNode x)
    {
        int count=0;
        while(x!=null)
        {
            count++;
            x=x.next;
        }
        return count;
    }
    private ListNode incrementer(ListNode x,int count)
    {
        ListNode ans=null;
        for(int i=0;i<count;i++)
        {
            x=x.next;
        }
        ans=x;
        return ans;
    }
    private ListNode intersection(ListNode A,ListNode B)
    {
        while(A!=null && B!=null)
        {
            if(A==B)
            {
                return A;
            }
            A=A.next;
            B=B.next;
        }
        return null;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lA=length(headA);
        int lB=length(headB);
        int diff=0;
        ListNode tempA=headA;
        ListNode tempB=headB;
        if(lA>lB)
        {
            diff=lA-lB;
            tempA= incrementer(headA,diff);
            return intersection(tempA,tempB);
            
        }
        else if(lA<lB)
        {
            diff=lB-lA;
            tempB=incrementer(headB,diff);
            return intersection(tempA,tempB);
        }
        else
        {
            return intersection(tempA,tempB);
        }
       
    }
}better solution
//
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        
        while(tempA!=tempB)
        {
            if(tempA==null)
            {
                tempA=headB;
            }
            else
            {
                tempA=tempA.next;
            }
             if(tempB==null)
            {
                tempB=headA;
            }
            else
            {
                tempB=tempB.next;
            }
        }
        return tempB;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        String str="";
        while(head!=null)
        {
            str+=Integer.toString(head.val);
            head=head.next;
        }
        return Integer.parseInt(str,2);
    }
}
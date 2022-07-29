/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode i=head;
        ListNode j=head;
        while(j!=null && j.next!=null)
        {
            
            j=j.next.next;
            i=i.next;
            if(i==j)
            {
                return true;
            }
        }
        return false;
    }
}
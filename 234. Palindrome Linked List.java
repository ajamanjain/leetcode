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
    
    public ListNode findMiddle(ListNode head)
    {
     ListNode turtle = head;
     ListNode rabbit = head;
        
        while(rabbit.next!=null && rabbit.next.next!=null)
        {
            rabbit = rabbit.next.next;
            turtle = turtle.next;
        }
        
        return turtle;
    }
    
    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr!=null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head.next==null || head==null)
        {
            return true;
        }
        
        ListNode middle = findMiddle(head);
        ListNode secondHalf = reverse(middle.next);
        ListNode firstHalf = head;
        
        while(secondHalf!=null)
        {
            if(firstHalf.val != secondHalf.val)
            {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        
        return true;
    }
}

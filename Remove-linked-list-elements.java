// Problem : https://leetcode.com/problems/remove-linked-list-elements/?envType=problem-list-v2&envId=recursion
// time taken --> 1ms
class Solution {
    private ListNode newList(ListNode head, int val) {
        if (head == null) return null;

        head.next = newList(head.next, val);
        return head.val == val ? head.next : head;
    }

    public ListNode removeElements(ListNode head, int val) {
         
        return newList(head , val);
        
    }
}

// An ANOTHER solution as same but it takes less time--> 0ms
class Solution {
    
    public ListNode removeElements(ListNode head, int val) {
         
        if(head == null) return null;

        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
        
    }
}

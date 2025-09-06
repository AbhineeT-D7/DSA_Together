// Problem : https://leetcode.com/problems/remove-nth-node-from-end-of-list/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;

        while(temp != null){
            temp = temp.next;
            count++;
        }

        if(count - n == 0) return head.next;

        temp = head;

        for(int i = 1 ; i < count-n ; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}

// Problem : https://leetcode.com/problems/reverse-linked-list-ii/?envType=problem-list-v2&envId=linked-list

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;

        ListNode tempNode = null;
        ListNode prevNode = head;
        for(int i = 1; i < left ; i++){
            tempNode = prevNode;
            prevNode = prevNode.next;
        }

        ListNode lastNode = prevNode;
        ListNode currNode = prevNode.next;
        for(int i = 0; i < right-left; i++){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        lastNode.next = currNode;
        if(tempNode != null) {
            tempNode.next = prevNode;
            return head;
        }
        return prevNode;
    }
}

// Problem : https://leetcode.com/problems/reverse-linked-list/?envType=problem-list-v2&envId=linked-list

class Solution {
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode prevNode = head;
        ListNode currNode = head.next;

        while(currNode != null){
            ListNode nextNode = currNode.next;

            currNode.next = prevNode;
            prevNode = currNode;

            currNode = nextNode;
        }

        head.next = null;

        return prevNode;

        
    }
}

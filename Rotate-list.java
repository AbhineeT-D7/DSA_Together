// Problem : https://leetcode.com/problems/rotate-list/?envType=problem-list-v2&envId=two-pointers 

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0  || head == null || head.next == null) return head;

        ListNode temp1 = head;
        int count = 1;

        while(temp1.next != null){
            temp1 = temp1.next;
            count++;
        }

        k%=count; // Reducing number of rotation

        temp1.next = head; // Making circular for less travesing{O(k*n) ---> O(n)}

        ListNode temp2 = head;
        for(int i = 0 ; i < count - k - 1 ; i++){
            temp2 = temp2.next; 
        }

        head = temp2.next;
        temp2.next = null;

        return head;
        
    }
}

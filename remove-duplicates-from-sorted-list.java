// Problem : https://leetcode.com/problems/remove-duplicates-from-sorted-list/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null ) return head;
        ListNode tempHead = head ;
        ListNode temp = tempHead.next;
        
        while(temp != null){
            if(tempHead.val == temp.val){
                tempHead.next = temp.next;
                temp = tempHead.next;
            }else{
                tempHead = temp;
                temp = temp.next;
            }
            
        }

        return head;
    }
}

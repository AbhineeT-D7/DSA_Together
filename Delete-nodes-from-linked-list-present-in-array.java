// Problem : https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/description/?source=submission-ac

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode tempHead = dummy;

        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        } 

        while(head != null){
            if(!set.contains(head.val)){
                tempHead.next = head;
                tempHead = tempHead.next;
            }
            head = head.next;
            tempHead.next = null;  
        }

        return dummy.next;
        
    }
}

// Problem :- https://leetcode.com/problems/add-two-numbers/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummyNode = new ListNode(0);
        ListNode point = dummyNode;
       
        while(l1 != null || l2 != null){
            int sum = carry; 
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            ListNode newNode = new ListNode(sum%10);
            carry = sum / 10;
            point.next = newNode;
            point = point.next;
        }
        if(carry != 0 ){
            ListNode newNode = new ListNode(carry);
            point.next = newNode;
        }
        return dummyNode.next;
    }
}

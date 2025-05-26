//problem : https://leetcode.com/problems/merge-two-sorted-lists/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode  point = temp;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                point.next = list1;
                list1 = list1.next;
            }else{
                point.next = list2;
                list2 = list2.next; 
            }

            point = point.next;
        }

        if(list1 != null){
            point.next = list1;
        }else if(list2 != null){
            point.next = list2;
        }
        
        return temp.next;
    }
}

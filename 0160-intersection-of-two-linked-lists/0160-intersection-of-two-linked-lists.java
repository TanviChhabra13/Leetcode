/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }

        ListNode pointer1= headA, pointer2=headB;

        while(pointer1!=pointer2){
            pointer1= pointer1!=null? pointer1.next: headB;
            pointer2= pointer2!=null? pointer2.next: headA;
        }
        return pointer1;
    }
}
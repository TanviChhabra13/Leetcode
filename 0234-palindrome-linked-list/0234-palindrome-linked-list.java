class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head, slow=head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
            ListNode prev=null,curr=slow;
            while(curr!=null){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            while(prev!=null){
                if(prev.val!=head.val){return false;}
                prev=prev.next;
                head=head.next;
            }
            return true;
    }
}
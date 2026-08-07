class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 0;i<left-1;i++){
            pre = pre.next;
        }
        ListNode curr = pre.next;
        for(int i = 0;i<right-left;i++){
            ListNode nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = pre.next;
            pre.next = nextNode;
        }
        return dummy.next;
    }
}
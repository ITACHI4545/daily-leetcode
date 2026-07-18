class Solution {
    private int helper(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            int gcd = helper(curr.val,curr.next.val);
            ListNode temp = new ListNode(gcd);
            temp.next = curr.next;
            curr.next = temp;
            curr = temp.next;
        }
        return head;
    }
}
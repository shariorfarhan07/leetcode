public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null) return head;
        ListNode tail=head;
        int a=0;
        while (tail.next!=null){
            a=tail.val;
            tail.val=tail.next.val;
            tail.next.val=a;
            tail=tail.next.next;
            if(tail==null) break;
        }
        return head;
    }
}

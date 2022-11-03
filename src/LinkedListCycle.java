public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode p=head,c=head;

        while (p.next!=null){
            p=p.next;
            if (c.next!=null)
                c=c.next;
            if (c.next!=null)
                c=c.next;
            if (p.val==c.val) return true;
        }

        return false;
    }
}

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode l=head;
        ListNode r=head;
        while (r!=null){
            if (l.val!=val){
            r=r.next;
            }else {
            l.next=r.next;
            l=l.next;
            }

        }
        return head;
    }
    public ListNode removeElements1(ListNode head, int val) {
        while (head!=null&&head.val==val)  head=head.next;
        ListNode tail=head;
        if (head==null) return null;
        while (tail.next!=null){
            if (tail.next.val==val)tail.next=tail.next.next;
            else tail=tail.next;
        }
        return head;
    }
}

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
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

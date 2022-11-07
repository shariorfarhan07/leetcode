public class ReverseLinkedList206 {
//    reverse using new nodes
/* time complexity O(n) space O(n)*/
    public ListNode reverseList(ListNode head) {
        if (head==null) return  null;
            ListNode tail=new ListNode(head.val,null);
            head=head.next;
            while (head!= null){
                tail.next=new ListNode(head.val,tail);
                head=head.next;
                tail=tail.next;
            }

    return tail;
    }
//     reverse without new nodes
    /* time complexity O(n) space O(1)*/
public ListNode reverseList2(ListNode head) {
    if (head==null) return  null;
    ListNode prev=null,current=head,next=null;
    while (current!=null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    }
    return prev;
}
}

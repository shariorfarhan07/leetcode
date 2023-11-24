package leetcode75;
public class ReorderList {
    public void reorderList(ListNode head) {
    ListNode fast=head,slow=head;
// find the middle of the node
    while (fast!=null){
        slow=slow.next;
        if (fast.next!=null &&fast.next.next!=null) fast=fast.next.next;
        if (fast==null) break;
    }
// reverse the last half of the node

    ListNode curent=slow,pre=null,next=null;
        while (curent!=null){
            next=curent.next;
            curent.next=pre;
            pre=curent;
            curent=next;
        }
//  L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …

        while (pre.next!=null && head.next!=null){
            ListNode temp=head.next;
            head.next=pre;
            head=head.next;
        }


    }
}

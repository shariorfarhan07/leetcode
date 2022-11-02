public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode left=head;
        ListNode right=head.next;
        while (right!=null){
            if (left.val== right.val){
                left.next=right.next;
            }
            left=left.next;
            right=right.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l=new  ListNode(1,new  ListNode(1,new  ListNode(2,new  ListNode(2,null))));
    }

}

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
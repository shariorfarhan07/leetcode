public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode left=head;
        ListNode right=head.next;
        while (left!=null){
//            System.out.println(left.val+" "+ right.val);
            while (right!=null&&left.val== right.val){
                left.next=right.next;
                right=right.next;
            }
                left=left.next;
            if (right==null)
                break;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l=new  ListNode(1,new  ListNode(1,new  ListNode(2,new  ListNode(2,null))));
        l=new RemoveDuplicatesfromSortedList().deleteDuplicates(l);
        print(l);
//        for (int i = 0; i < 50; i=i+2) {
//            System.out.println(i);
//        }
  }
    public static void print(ListNode n){
        System.out.println(n.val);
        if (n.next!= null) print(n.next);
    }

}

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
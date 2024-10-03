public class RemoveDuplicatesfromSortedList {
    public static void main(String[] args) {
        ListNode l=new  ListNode(1,new  ListNode(1,new  ListNode(2,new  ListNode(2,new  ListNode(2,null)))));
//         l=new  ListNode(1,new  ListNode(1,new  ListNode(2,null)));
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

    public ListNode deleteDuplicates(ListNode head) {
        ListNode tail=head;
        while (tail.next!=null){
            if (tail.val==tail.next.val) tail.next=tail.next.next;
            tail=tail.next;
        }
        return head;
    }

        public ListNode deleteDuplicates3(ListNode head) {




            if(head==null) return null;
            ListNode left=head;
            ListNode right=head;
            while (right!=null){
                // System.out.println(left.val+" "+ right.val);
                if (left.val!=right.val){
                    left.next=right;
                    left=left.next;
                }
                right=right.next;
            }
            left.next=right;
            return head;
        }

    public ListNode deleteDuplicates2(ListNode head) {

        ListNode left=head;
        ListNode right=head;
        while (left!=null){
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

}

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
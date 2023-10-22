
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

public class RemoveNthNodeFromEndofList {

     public  static  void  printList(ListNode n){
        if (n!=null){
            System.out.println(n.val);
            printList(n.next);
        }
     }


        public static void main(String[] args) {
        ListNode n = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6,new ListNode(7)))))));
//        printList(n);
        printList(removeNthFromEnd(n,2));
        printList(removeNthFromEnd(new ListNode(1),1));




    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode tail=head;
        while (tail!=null){
            count++;
            tail=tail.next;
        }
        tail=head;
        int i=count-n;
        if (i==0) return head.next;
        while (i--!=1 && tail!=null){
            tail=tail.next;
        }
//        System.out.println(tail.val+"test");
        if (tail!=null)tail.next=tail.next.next;
        return head;
    }



}
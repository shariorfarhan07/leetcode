import java.util.List;

public class RemoveNthNodeFromEndofList {
    public static void main(String[] args){
       ListNode n= new ListNode(1,new ListNode(11,new ListNode(111,new ListNode(1111))));
       printlist(n);
       n=removeNthFromEnd(n,4);
       printlist(n);
    }
    private static void printlist(ListNode l1) {
        while (l1!=null) {
            System.out.print(l1.val+"-->");
            l1=l1.next;
        }
        System.out.println();
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tail=head;
        int itarator=0,count=0;
        while (tail!=null){tail=tail.next;count++;}
        if (count==n) return head.next;
        tail=head;
        while (itarator++<count-n-1){
            tail=tail.next;
        }
        System.out.println(tail.val);
        tail.next=tail.next.next;
        return head;
    }
}

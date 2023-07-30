public class Rotate_List {
    public static void main(String[] args){
        ListNode n= new ListNode(1,new ListNode(11,new ListNode(111,new ListNode(1111))));
        printlist(n);
        printlist(rotateRight(n,2));

    }

    private static void printlist(ListNode l1) {
        while (l1!=null) {
            System.out.print(l1.val+"-->");
            l1=l1.next;
        }
        System.out.println();
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null) return head;

        ListNode tail=head;
        int count=0;
        while (!(tail==null)){
            tail=tail.next;
            count++;
        }
        k=k%count;
        tail=head;
        int i=0;
        while (count-k-1>i++){
            tail=tail.next;
        }
        System.out.println(tail.val);
        ListNode newHead=tail.next;
        tail.next=null;

        ListNode oldhead=head;
        head=newHead;

        while (newHead.next!=null) newHead=newHead.next;
        newHead.next=oldhead;
        return head;
    }





}

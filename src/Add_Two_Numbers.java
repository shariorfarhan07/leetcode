public class Add_Two_Numbers {
    public static void main(String[] args) {
//        ListNode l1=new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(1))))))));
//        ListNode l2=new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9)))))));
        ListNode l2=new ListNode(9,new ListNode(9,new ListNode(9)));
        ListNode l1=new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(1))))))));
        printlist(l1);
        printlist(l2);
        printlist(addTwoNumbers(l1,l2));

    }

    private static void printlist(ListNode l1) {
        while (l1!=null) {
            System.out.print(l1.val+"-->");
            l1=l1.next;
        }
        System.out.println();
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode();
        ListNode tail=head;
        int sum=0;
        while (l1!=null || l2!=null){
            sum=((l1!=null)? l1.val : 0)+((l2!=null)? l2.val : 0)+sum;
            tail.next=new ListNode(sum%10);
            sum=sum/10;
            tail=tail.next;
            if (l1!=null) l1=l1.next;
            if (l2!=null) l2=l2.next;
        }
        if (sum!=0) tail.next=new ListNode(sum);
        return head.next;
    }








    public static ListNode addTwoNumbersbest(ListNode l1, ListNode l2) {
        ListNode head=new ListNode();
        ListNode tail=head;
        int a=0,b=0,sum=0;
        while (l1!=null || l2!=null){
        tail.next=new ListNode(((l1!=null)? l1.val : 0)+((l2!=null)? l2.val : 0));
        tail=tail.next;
        if (l1!=null) l1=l1.next;
        if (l2!=null) l2=l2.next;
        }
        tail=head;
        sum=0;
        while (tail!=null){
            sum= tail.val+sum;
            tail.val=sum%10;
            sum/=10;

            if (tail.next==null) break;
            tail=tail.next;

        }

        if (sum!=0) tail.next=new ListNode(sum);


        return head.next;
    }




    public static ListNode addTwoNumbers11(ListNode l1, ListNode l2) {
        ListNode head=l1;
        int a=0,b=0,sum=0;
        boolean bb=(l1!=null && l2!=null);
        while (l1!=null || l2!=null){
            if (bb){
                sum=l1.val+l2.val+sum;
                l1.val=sum%10;
                sum/=10;
                bb=(l1.next!=null && l2.next!=null);
                if (!bb) continue;
                l1=l1.next;
                l2=l2.next;
            }
            else if (l2!=null){
                sum=l1.val+sum;
                l1.val=sum%10;
                sum/=10;
                l1.next=l2.next;
                break;
            }
        }



        return head;
    }







    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        ListNode head=l1;
        boolean b = false,a = false;
        while (!b && !a){
            l1.val=l1.val+l2.val;
            if (l1.next==null) {a=true; break;}
            if (l2.next==null) {b=true; break;}
            l1=l1.next;
            l2=l2.next;
        }
        while (l1.next!=null) l1=l1.next;

        if (!a && b)l1.next=l2.next;

        ListNode tail=head;
        int result=0;

        while (tail!=null){
            result= tail.val+result;
            tail.val=result%10;
            result/=10;
            if (tail.next==null) break;
            tail=tail.next;
        }

        if (result!=0) tail.next=new ListNode(result);
        

        return head;
    }



//    not working properly
    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode head=l1,tail = null;
        while (l1!=null && l2!=null){
            l1.val=l1.val+l2.val;
            l1=l1.next;
            l2=l2.next;
            if (l1.next!=null) tail=l1;
        }
        if (l2 != null) tail.next=l2;

        int reminder=0;
        ListNode lastnode=null;
        tail=head;

        System.out.println(l1.val+" "+l2.val);

        while (tail!=null){
            reminder= tail.val+reminder;
            tail.val=reminder%10;
            reminder=reminder/10;
            tail=tail.next;
            if ( tail!=null && tail.next==null) lastnode=tail;
        }
        if (reminder!=0) lastnode.next=new ListNode(reminder,null) ;

        return head;
    }


      public static class ListNode {
        int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}

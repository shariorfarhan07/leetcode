public class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newlist;
        if (list1!=null&&list1.val<list2.val){
            newlist=list1;
            list1=list1.next;
        }else {
            newlist=list2;
            list2=list2.next;
        }
        ListNode itarator=newlist;
        while (list1!=null && list2!=null){
            if (list1.val<list2.val){
                itarator.next=list1;
                list1=list1.next;
            }else {
                itarator.next=list2;
                list2=list2.next;
            }
            itarator=newlist.next;
        }
        while (list1!=null){
            itarator.next=list1;
            list1=list1.next;
            itarator=newlist.next;
        }
        while (list2!=null){
            itarator.next=list2;
            list2=list2.next;
            itarator=newlist.next;
        }

        return newlist;
    }
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode newlist=new ListNode();

        ListNode itarator=newlist;
        while (list1!=null && list2!=null){
            if (list1.val<list2.val){
                itarator.next=list1;
                list1=list1.next;
            }else {
                itarator.next=list2;
                list2=list2.next;
            }
            itarator=itarator.next;
        }
        while (list1!=null){
            itarator.next=list1;
            list1=list1.next;
            itarator=itarator.next;
        }
        while (list2!=null){
            itarator.next=list2;
            list2=list2.next;
            itarator=itarator.next;
        }

        return newlist.next;
    }



      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }



}
package leetcode75;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }



public class MergekSortedLists {
    public  static  ListNode mergeKLists(ListNode[] lists) {
        ListNode newlist=null;
        for(int i = 0; i < lists.length; i++) {
            newlist=mergeTwoLists(newlist,lists[i]);
        }
    return newlist;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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

        if (list1!=null)itarator.next=list1;
        if (list2!=null)itarator.next=list2;


        return newlist.next;
    }


}

import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Two_Linked_Lists {
   public static Set<ListNode> set=new HashSet<>();
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA ==null && headB==null) return null;
    if (headA != null){
        if (set.contains(headA)) return headA;
        set.add(headA);
        headA=headA.next;
    }
    if (headB != null){
            if (set.contains(headB)) return headB;
            set.add(headB);
            headB=headB.next;
    }

    return getIntersectionNode(headA,headB);
    }
}

public class PalindromeLinkedList {
// with O(N) space complexity
    public boolean isPalindrome(ListNode head) {
        ListNode first=head,reverse=null;
        while (first!=null){
            reverse=new ListNode(first.val,reverse);
            first=first.next;
        }
        first=head;
        while (first!=null){
            if (first.val!=reverse.val) return false;
            first=first.next;
            reverse=reverse.next;
        }
        return true;
    }
}

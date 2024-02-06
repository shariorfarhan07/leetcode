import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListwithRandomPointer {
    public static void main(String[] args){

    }
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> list=new HashMap<>();
        Node n=new Node(0);
        Node newtail=n;
        Node tail =head;
        while (tail!=null){
            newtail.next=new Node(tail.val);
            list.put(tail,newtail.next);
            tail=tail.next;
            newtail=newtail.next;
        }
        newtail=n.next;
        tail=head;
        while (newtail!=null){
            if (tail.random!=null) newtail.random=list.get(tail.random);
            tail=tail.next;
            newtail=newtail.next;

        }
    return n.next;
    }



}

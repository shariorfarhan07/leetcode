import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph {
    public static Node cloneGraph(Node node) {
        HashMap<Integer,Node> tracker=new HashMap<>();

        return cloneGraphTrack(node,tracker);
    }

    public static Node cloneGraphTrack(Node n, HashMap<Integer,Node> tracker){
    Node newNode=tracker.get(n.val);

    if (newNode==null){
        newNode=new Node(n.val);
        tracker.put(n.val,newNode);
    }






    return newNode;
    }

    static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }



}

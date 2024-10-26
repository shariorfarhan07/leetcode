import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class MinStack {
    private int min=Integer.MAX_VALUE;
    private TreeMap<Integer,Integer> map;
    private Stack<Integer> stack;

    public MinStack() {
        stack =new Stack<>();
        map =new TreeMap<>();

    }

    public void push(int val) {
    if (val<min){min=val;}
        stack.push(val);
        map.put(val,map.getOrDefault(val,0)+1);

    }

    public void pop() {
        int temp =stack.pop();
        int n =map.get(temp)-1;
        if (n == 0) map.remove(temp);
        else map.put(temp,map.get(temp)-1);
        if (min == temp){
            min=map.firstKey();
        }
    }

    public int top() {
    return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
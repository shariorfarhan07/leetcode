import java.util.Stack;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue q=new MyQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        System.out.println(q.empty());
//        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}

class MyQueue {
    Stack<Integer> s1,s2,temp;
    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public void push(int x) {
        s1.push(x);




    }

    public int pop() {
        while (!s1.isEmpty())s2.push(s1.pop());
        int a=s2.pop();
        while (!s2.isEmpty())s1.push(s2.pop());
        return a;
    }

    public int peek() {

        while (!s1.isEmpty())s2.push(s1.pop());
        int a=s2.peek();
        while (!s2.isEmpty())s1.push(s2.pop());
        return a;
    }

    public boolean empty() {

        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

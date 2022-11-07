import java.util.LinkedList;
import java.util.Queue;

class MyStack {
        Queue<Integer>q1,q2,temp;

        public MyStack() {
               q1=new LinkedList<>();
               q2=new LinkedList<>();
        }

        public void push(int x) {
                        q2.add(x);
                        while (!q1.isEmpty())q2.add(q1.poll());
                        temp=q1;
                        q1=q2;
                        q2=temp;
        }

        public int pop() {

                return q1.poll();
        }

        public int top() {

                return q1.peek();
        }

        public boolean empty() {


                return q1.isEmpty();
        }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}

/* Implementation of stack with single queue*/
class MyStack2 {

        private Queue<Integer> queue = new LinkedList<>();

        public void push(int x) {
                queue.add(x);
                for(int i = 1;i<queue.size();i++) {
                        queue.add(queue.remove());
                }
        }

        public int pop() {
                return queue.remove();
        }

        public int top() {
                return queue.peek();
        }

        public boolean empty() {
                return queue.isEmpty();
        }
}
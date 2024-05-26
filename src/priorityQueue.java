import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args){
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        minHeap.add(10);
        minHeap.add(1);
        minHeap.add(9);
        minHeap.add(5);
        minHeap.add(4);
        minHeap.add(18);
        System.out.println(minHeap);


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(1);
        maxHeap.add(9);
        maxHeap.add(5);
        maxHeap.add(4);
        maxHeap.add(18);
        System.out.println(maxHeap.peek());
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.poll());

    }
}

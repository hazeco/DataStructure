import java.util.*;

public class queues {
    public static void main(String[] args) {

        // Queue<String> queue = new LinkedList<String>();

        
        // queue.offer("Karen");
        // queue.offer("Chad");
        // queue.offer("Steve");
        // queue.offer("Harold");
        
        //System.out.println(queue.isEmpty());
        //System.out.println(queue.size());
        //System.out.println(queue.contains("Harold"));

        //System.out.println(queue.peek());
        //queue.poll();

        //queue.element();
    
        // System.out.println(queue);

        //Priority queues
        // Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder());

        // queue.offer(3.0);
        // queue.offer(2.5);
        // queue.offer(4.0);
        // queue.offer(1.5);
        // queue.offer(2.0);

        // System.out.println(queue.isEmpty());

        // while(!queue.isEmpty()){
        //     System.out.println(queue.poll());
        // }

        // System.out.println(queue);

        Queue<String> queue = new PriorityQueue<String>();

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("D");
        queue.offer("F");

        System.out.println(queue.isEmpty());

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        System.out.println(queue);
    }
}

package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        System.out.println(queue);
         //no deference with add
        queue.offer("d");
        System.out.println(queue);

        var front = queue.peek();
        System.out.println(front);
        queue.remove();
        System.out.println(queue);
    }
}

import java.util.*;

public class queueopt {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // add()
        q.add(10);
        q.add(20);

        // offer()
        q.offer(30);
        q.offer(40);

        System.out.println("Queue : " + q);

        // size()
        System.out.println("Size : " + q.size());

        // isEmpty()
        System.out.println("Is Empty : " + q.isEmpty());

        // peek()
        System.out.println("Peek : " + q.peek());

        // element()
        System.out.println("Element : " + q.element());

        // poll()
        System.out.println("Poll : " + q.poll());
        System.out.println("Queue after Poll : " + q);

        // remove()
        System.out.println("Remove : " + q.remove());
        System.out.println("Queue after Remove : " + q);

        // size()
        System.out.println("Size : " + q.size());

        // isEmpty()
        System.out.println("Is Empty : " + q.isEmpty());
    }
}
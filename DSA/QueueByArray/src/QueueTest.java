public class QueueTest {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(6);
        System.out.println(queue);
        queue.enqueue(4);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(24);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
        System.out.println(queue);
        queue.dequeue();
    }
}

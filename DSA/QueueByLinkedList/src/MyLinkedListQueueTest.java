public class MyLinkedListQueueTest {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        System.out.println(queue);
        queue.enqueue(20);
        System.out.println(queue);
        queue.enqueue(30);
        System.out.println(queue);
        queue.enqueue(40);
        System.out.println(queue);
        queue.enqueue(50);
        System.out.println(queue);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}

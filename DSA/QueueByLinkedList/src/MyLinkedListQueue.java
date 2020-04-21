public class MyLinkedListQueue {
    public Node head;
    public Node tail;
    public MyLinkedListQueue(){ //Khởi tạo queue rỗng
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){  //enqueue đầu tail
        Node temp = new Node(key);
        if(this.tail == null){
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
    public Node dequeue() { //dequeue đầu head
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
    public String toString(){
        String result ="";
        Node temp = head;
        while(temp != null) {
            result+=temp.key+" ";
            temp = temp.next;
        }
        return result;
    }
}
class Node {
    public int key;
    public Node next;
    public Node(int key){
        this.key = key;
        this.next = null;

    }
}

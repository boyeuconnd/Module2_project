public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10); //Tạo 1 linked list có 1 phần tử 10 đầu tiên
        ll.addFirst(11);
        ll.printList();
        ll.add(7,100);// nếu index > LinkedList size => Thêm vào phần tử cuối cùng
        ll.printList();
        ll.add(7,101);
        ll.printList();
        ll.addFirst(12);
        ll.printList();
        ll.addFirst(13);
        ll.printList();
        ll.addFirst(14);
        ll.printList();
        ll.addFirst(15);
        ll.printList();
        ll.addFirst(16);
        ll.printList();

        ll.add(4,9); //Thêm phần tử 9 vào index 4, các phần tử sau, nhảy thêm 1 index
        ll.printList();
        ll.add(4,0);
        ll.printList();
//        ll.get(16); //NullPointerException eror nếu head > size
        ll.get(7); //LinkedList không thay đổi

    }
}

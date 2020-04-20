
import java.util.Arrays;

public class MyList<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements; //= (E[]) new Object[DEFAULT_CAPACITY];
//    private Object elements[];
    public MyList(){ //Khởi tạo với capacity mặc định
        elements =  (E[])new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){ //Khởi tạo với capacity tham số truyền vào
        elements = (E[]) new Object[capacity];
    }
    public int getLength(){
        return elements.length;
    }
    public int getSize() { //getSize của biến mảng ArrayList
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e){
        if(size ==elements.length){
            ensureCapacity();
        }
        elements[size++]=e;
    }
    public void add(E e,int index){
        if(index >= elements.length || this.size == elements.length){
            ensureCapacity();
        }
        for(int j = elements.length-1;j>index;j--){
            Object temp = elements[j];
            elements[j]=elements[j-1];

        }
        elements[index]=e;
    }
    public E remove(int index){
        E holder = elements[index];
        //Shifting elements from right side to left 1 index
        for(int i = index;i<this.getSize();i++){
            elements[i]=elements[i+1];
        }
        //Delete last element, reduce size
        elements[getSize()]=null;
        this.setSize(this.getSize()-1);
        return holder;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i]))
                return true;
        return false;
    }
    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i])) return i;
        return -1;
    }
    @Override
    public String toString(){
        String result="";
        for (int i=0;i<elements.length;i++){
            result+=elements[i]+" ";
        }
        return result;
    }

}

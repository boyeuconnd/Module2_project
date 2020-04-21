import java.util.EmptyStackException;
import java.util.LinkedList;

public class GenericStack<T> {
    private LinkedList<T> myStack;

    public GenericStack() {
        myStack = new LinkedList();
    }
    public void push(T element) {
        myStack.addFirst(element);
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return myStack.removeFirst();
    }
    public int size() {
        return myStack.size();
    }
    public boolean isEmpty() {
        if (myStack.size() == 0) {
            return true;
        }
        return false;
    }
}

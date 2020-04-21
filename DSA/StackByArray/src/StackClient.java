public class StackClient {
    public static void main(String[] as) throws Exception {
        System.out.println("1.Create a stack by array with capacity = 5");
        MyStack stack = new MyStack(5);
        for(int i=5;i>0;i--){
            System.out.println("2."+(6-i)+" Push element "+i+" to stack.");
            stack.push(i);
        }

        System.out.println("3. Size of stack after push operations: " + stack.getSize());
        System.out.printf("4. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n5. Size of stack after pop operations : " + stack.getSize());

    }
}

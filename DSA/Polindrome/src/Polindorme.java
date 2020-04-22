import java.util.*;

public class Polindorme {

    public static boolean polindromeCheck(String string){
        Stack<Character> myStack = new Stack<>();
        Queue<Character> myQueue = new LinkedList();
        for (int i =0;i<string.length();i++){
            myStack.push(string.charAt(i));
            myQueue.add(string.charAt(i));
        }
        boolean flagCheck = true;
        while (!myQueue.isEmpty()){
            if(Character.toLowerCase(myQueue.poll())!=Character.toLowerCase(myStack.pop())){
                flagCheck = false;
                break;
            }
        }
        return flagCheck;
    }
}

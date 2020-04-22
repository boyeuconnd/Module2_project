import java.util.Stack;

public class BracketCheck {
    public static void main(String[] args) {
        System.out.println(bracketCheck("s * (s – a) * (s – b) * (s – c)"));
        System.out.println(bracketCheck("(– b + (b2 – 4*a*c)^0.5) / 2*a"));
        System.out.println(bracketCheck("s * (s – a) * (s – b * (s – c)"));
        System.out.println(bracketCheck("s * (s – a) * s – b) * (s – c) "));
        System.out.println(bracketCheck("(– b + (b^2 – 4*a*c)^(0.5/ 2*a))"));
    }
    public static boolean bracketCheck(String mathMethod){
        Stack<Character> myStack = new Stack();

        for(int i = 0; i<mathMethod.length();i++){
            if(mathMethod.charAt(i)=='('){
                myStack.push(mathMethod.charAt(i));
            }else if(mathMethod.charAt(i)==')'){
                if(myStack.isEmpty()){
                    return false;
                }else{
                    myStack.pop();
                }
            }
        }
        if(myStack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}

import java.util.Scanner;
import java.util.Stack;

public class Decimal_Binary_test {
    public static String decimalToBinary(int number){
        Stack<Integer> myStack = new Stack<>();
        String binaryString ="";
        if(number == 0){
            return "0";
        }else if(number==1){
            return "1";
        }else {
            while (number>0){
                myStack.push(number%2);
                number /= 2;

            }
            while (!myStack.isEmpty()){
                binaryString += Integer.toString(myStack.pop());
            }
            return binaryString;
        }


    }
}

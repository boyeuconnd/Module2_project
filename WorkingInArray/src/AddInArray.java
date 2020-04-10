import java.util.Arrays;
import java.util.Scanner;

public class AddInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] myArray = {0,1,2,3,4,5,6,7,8,9,10,11};
        System.out.print("Enter element u want to add: ");
        int inputNum = scn.nextInt();
        System.out.print("Enter position of element u want to add: ");
        int index = -1;
        do{
            index = scn.nextInt();
            if(index<0||index>myArray.length-1)
                System.out.print("Invalid value, enter again: ");;
        }while (index<0||index>myArray.length-1);
        for(int i =myArray.length-1;i>=index;i--){
            myArray[i] = myArray[i-1] ;
        }
        myArray[index]=inputNum;
        System.out.println(Arrays.toString(myArray));

    }
}

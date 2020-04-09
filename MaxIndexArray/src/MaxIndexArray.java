import java.util.Arrays;
import java.util.Scanner;

public class MaxIndexArray {
    public static void main(String[] args) {
        int[] myArray;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the array length ");
        int size = scn.nextInt();
        while (size>20){
            System.out.print("Size should not exceed 20, plz enter again: ");
            size = scn.nextInt();
        }
        myArray = new int[size];
        for(short i =0;i< myArray.length;i++){
            System.out.print("Enter element "+(i+1)+" of the array: ");
            myArray[i]=scn.nextInt();
        }
        System.out.println("Property list: "+ Arrays.toString(myArray));
//        for (int j = 0; j < myArray.length; j++) {
//            System.out.print(myArray[j] + "\t");
//        }
        int maxElement = myArray[0];
        int indexMax =1;
        for(int j =1;j<myArray.length;j++){
            if(maxElement<myArray[j]){
                maxElement = myArray[j];
                indexMax = j+1;
            }
        }
        System.out.println("Max element in array is "+ maxElement+ ", at index "+ indexMax);

    }
}

import java.util.Arrays;
import java.util.Scanner;

public class MinValueByMethod {
    public static int find_min_value(int[] array){
        int minvalue = array[0];
        for(int i =0;i<array.length;i++){
            if (minvalue > array[i])
                minvalue = array[i];
        }
        return minvalue;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = -1;
        do{
            System.out.print("Enter size of array: ");
            size = scn.nextInt();
            if(size>10)
                System.out.print("Size should not exceed than 10, enter again: ");
        }while (size > 10);
        int[] myArray = new int[size];
        for (int i=0;i<myArray.length;i++){
            System.out.print("Enter elements at index:"+(i+1)+" ");
            myArray[i] = scn.nextInt();
        }
        System.out.println("Your array u input " + Arrays.toString(myArray));

        int result = find_min_value(myArray);
        System.out.println("The minimum value of array: "+result);

    }
}

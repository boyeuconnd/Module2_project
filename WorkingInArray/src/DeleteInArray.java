import java.util.Arrays;
import java.util.Scanner;

public class DeleteInArray {
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
        System.out.print("Enter the number u want to search and delete: ");
        int inputNum = scn.nextInt();
        boolean check = false;
        short count =0;
        for(int i=0;i<myArray.length;i++){
            if(inputNum == myArray[i]){
                check = true;
                count++;
                int index_del = i+1;
                while (index_del<=myArray.length){
                    int temp = 0;
                    myArray[index_del-1]=myArray[index_del];
                    myArray[index_del]=temp;
                    index_del++;
                    if(index_del==myArray.length)
                        break;
                }
            }
        }
        System.out.println("Have "+count+ " elements '"+inputNum+"' in array had been deleted:");
        System.out.println("New array: "+Arrays.toString(myArray));
        if(!check)
            System.out.println("Have no element u find");
    }
}

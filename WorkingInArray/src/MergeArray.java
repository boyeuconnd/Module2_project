import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] myArray1 = {0,1,2,3,4,5,6,7,8,9};
        int[] myArray2 = {10,11,12,13,14,15,16,17,18,19};
        int mergeArrayLength = myArray1.length + myArray2.length;
        int[] mergeArray = new int[mergeArrayLength];
        for(int i = 0;i<myArray1.length;i++){
            mergeArray[i]=myArray1[i];
        }
        for(int j = myArray1.length;j<mergeArrayLength;j++){
            mergeArray[j]=myArray2[j-myArray1.length];
        }
        System.out.println("Result Array after merge: ");
        for (int element :
             mergeArray) {
            System.out.print(element + "\t");
        }
    }
}

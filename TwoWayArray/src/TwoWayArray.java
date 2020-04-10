import java.util.Arrays;
import java.util.Scanner;

public class TwoWayArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] myArray;
        int row = -1;
        int col = -1;
        System.out.print("Enter your row: ");
        row = scn.nextInt();
        do{

            if(row>10){
                System.out.print("Not more than 10, plz again: ");
                row = scn.nextInt();
            }
        }while (row>10);
        System.out.print("Enter your col: ");
        col = scn.nextInt();
        do{

            if(col>10){
                System.out.print("Not more than 10, plz again: ");
                col = scn.nextInt();
            }
        }while (col>10);
        myArray = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j =0;j<col;j++){
                System.out.printf("Enter element row %2d col %2d: ",i+1,j+1);
                myArray[i][j]=scn.nextInt();
            }
        }
        System.out.println("=====Your 2 ways Array=======");
        for(int i =0;i<myArray.length;i++){
            for(int j = 0;j<myArray[0].length;j++){
                System.out.printf("%2d ",myArray[i][j]);
            }
            System.out.println();
        }
        int maxValue = myArray[0][0];
        for(int i =0;i<myArray.length;i++){
            for(int j = 0;j<myArray[0].length;j++){
                if(maxValue<myArray[i][j]){
                    maxValue = myArray[i][j];
                }
            }
        }
        System.out.println("Max element of array: "+maxValue);

    }
}

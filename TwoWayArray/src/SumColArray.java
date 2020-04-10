import java.util.Scanner;

public class SumColArray {
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
                System.out.printf("Enter element row %2d col %2d: ",i,j);
                myArray[i][j]=scn.nextInt();
            }
        }
        System.out.println("=====Your 2 ways Array=======");
        for(int i =0;i<myArray.length;i++){
            for(int j = 0;j<myArray[0].length;j++){
                System.out.printf("%3d ",myArray[i][j]);
            }
            System.out.println();
        }
        System.out.print("Enter your Col u want to SUM: ");
        int col_to_Sum =scn.nextInt();
        int result =0;
        do {
            if(col_to_Sum>myArray[0].length-1){
                System.out.print("Value not valid, plz enter again: ");
                col_to_Sum = scn.nextInt();
            }
        }while (col_to_Sum>myArray[0].length-1);
        for(int i =0;i<myArray.length;i++){
            result += myArray[i][col_to_Sum];
        }
        System.out.printf("Sum of col %2d in aray = %3d",col_to_Sum,result);
    }
}

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] myArray;
        int size = -1;
        System.out.print("Enter your matrix size: ");
        size = scn.nextInt();
        do{

            if(size>10){
                System.out.print("Not more than 10, plz again: ");
                size = scn.nextInt();
            }
        }while (size>10);

        myArray = new int[size][size];
        for(int i = 0;i<size;i++){
            for(int j =0;j<size;j++){
                System.out.printf("Enter element at position %2d:%2d : ",i,j);
                myArray[i][j]=scn.nextInt();
            }
        }
        System.out.println("=====Your Matrix=======");
        for(int i =0;i<myArray.length;i++){
            for(int j = 0;j<myArray[0].length;j++){
                System.out.printf("%3d ",myArray[i][j]);
            }
            System.out.println();
        }
        int diagonalSum = 0;
        for(int i=0;i<size;i++){
            diagonalSum+=myArray[i][i];
        }
        System.out.println("Sum of the main diagonal line of matrix: "+ diagonalSum);
    }
}

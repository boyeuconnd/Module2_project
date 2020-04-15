import java.util.Arrays;
import java.util.Comparator;

public class SquareComparatorTest {
    public static void main(String[] args) {
        Square[] squaresList = new Square[5];
        squaresList[0]= new Square(2);
        squaresList[1]= new Square(78);
        squaresList[2]= new Square(96);
        squaresList[3]= new Square(21);
        squaresList[4]= new Square(1,"purpul",true);
        System.out.println("Side pre-soft");
        for (Square s:squaresList) {
            System.out.println(s);
        }

        Comparator SquaresComparator = new SquareComparator(); //Gán biến SquareComparator bằng phương thức()
        Arrays.sort(squaresList,SquaresComparator);  //Method Arrays.soft trong Array.util với biến Array nhập vào và phương thức

        System.out.println("Side after-soft");
        for (Square s:squaresList) {
            System.out.println(s);
        }


    }
}

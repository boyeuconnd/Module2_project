import java.util.Arrays;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0]=new Square();
        squares[1]=new Square(30);
        squares[2]=new Square(26,"pink",false);

        System.out.println("Before side sorting:");
        for (Square squ:squares
             ) {
            System.out.println(squ);
        }
        Arrays.sort(squares);
        System.out.println("After side sorting:");
        for (Square squ:squares
        ) {
            System.out.println(squ);
        }


    }
}

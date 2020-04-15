public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0]=new Square();
        squares[1]=new Square(20);
        squares[2]=new Square(100,"Yellow",true);
        System.out.println("Before resize:");
        for (Square sq:squares
             ) {
            System.out.println(sq);
        }

        squares[0].resize(300);
        squares[1].resize(100);
        squares[2].resize(50);

        System.out.println("After resize:");
        for (Square sq:squares
        ) {
            System.out.println(sq);
        }




    }
}

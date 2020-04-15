public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0]=new Rectangle();
        rectangles[1]=new Rectangle(5,10,"Red",true);
        rectangles[2]=new Rectangle(100,300,"Black",false);
        System.out.println("Before resize:");
        for (Rectangle recg:rectangles
             ) {
            System.out.println(recg);
        }

        rectangles[0].resize(300);
        rectangles[1].resize(200);
        rectangles[2].resize(50);

        System.out.println("After resize:");
        for (Rectangle recg:rectangles
        ) {
            System.out.println(recg);
        }


    }
}

import java.util.Arrays;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new ComparableRectangle[3];
        rectangles[0]=new ComparableRectangle();
        rectangles[1]=new ComparableRectangle();
        rectangles[1].setWidth(30.2);
        rectangles[2]=new ComparableRectangle();
        rectangles[2].setWidth(9.0);
        System.out.println("Before width sorting:");
        for (Rectangle rec:rectangles
             ) {
            System.out.println(rec.toString());
        }

        Arrays.sort(rectangles);

        System.out.println("After width sorting");
        for (Rectangle rec:rectangles
        ) {
            System.out.println(rec);
        }

    }
}

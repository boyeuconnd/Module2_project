import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[4];
        rectangles[0] = new Rectangle(2.3, 5.8);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(4.0,7.9,"green",true);
        rectangles[3] = new Rectangle(25.0,14.0,"red",false);
        System.out.println("Area pre-soft");
        for (Rectangle r:rectangles
             ) {
            System.out.println(r);
        }

        Comparator recgComparator = new RectangleComparator();
        Arrays.sort(rectangles,recgComparator);

        System.out.println("Area after-soft");
        for (Rectangle r:rectangles
        ) {
            System.out.println(r);
        }
    }
}

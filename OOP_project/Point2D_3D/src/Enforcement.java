import java.util.Arrays;

public class Enforcement {
    public static void main(String[] args) {

        Point2D point2D = new Point2D(3.4f,6.7f);
        System.out.println(point2D.toString());
        point2D.setXY(9.7f,10.5f);
        System.out.println(point2D.toString());
        Point3D point3D = new Point3D(2.1f,5.7f,9.5f);
        System.out.println(point3D.toString());
        point3D.setXYZ(23.6f,45.8f,0.674f);
        System.out.println(point3D.toString());

    }
}

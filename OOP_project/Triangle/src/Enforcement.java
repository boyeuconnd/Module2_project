public class Enforcement {
    public static void main(String[] args) {
        //Mã kiểm thử class Shape
        Shape shape = new Shape();
        System.out.println(shape.toString());
        shape.setFilled(false);
        shape.setColor("blue");
        System.out.println(shape.toString());
        //Mã kiểm thử subclass Triangle
        System.out.println();
        Triangle triangle = new Triangle();
        System.out.println(triangle.toString());
        triangle.setColor("red");
        triangle.setFilled(false);
        triangle.setSide(12,4,9);
        System.out.println("\n New triangle after setter");
        System.out.println(triangle.toString());
    }
}

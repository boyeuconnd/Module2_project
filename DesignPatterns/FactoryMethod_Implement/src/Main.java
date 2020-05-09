import ShapeClass.Shape;
import ShapeClass.ShapeFactory;

public class Main {
    public static void main(String[] args) {
            ShapeFactory shapeFactory = new ShapeFactory();
            Shape myShape = shapeFactory.createShape("circle");
            Shape myShape2 = shapeFactory.createShape("rectangle");
            myShape.draw();
            myShape2.draw();




    }
}

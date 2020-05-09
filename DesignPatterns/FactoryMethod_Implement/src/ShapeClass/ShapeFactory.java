package ShapeClass;

import ShapeClass.Circle;
import ShapeClass.Rectangle;
import ShapeClass.Shape;
import ShapeClass.Square;

public class ShapeFactory implements I_Shape_factory  {

    @Override
    public Shape createShape(String kindOfShape) {
        switch (kindOfShape){
            case "circle":
                return  new Circle();

            case "square":
                return new Square();

            case "rectangle":
                return new Rectangle();
            default:
                throw new  RuntimeException("Not support this kind of shape");
        }

    }
}

public class Square extends Rectangle {
    private double side=1.0;
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean isFilled) {
        super(side, side, color, isFilled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }
    @Override
    public void setHeight(double height) {
        setSide(height);
    }
    @Override
    public String toString() {
        return "A Square with side= "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

}

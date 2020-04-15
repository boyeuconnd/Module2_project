public class Rectangle extends Shape {
    private double width =1.0;
    private double height=1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public Rectangle( double width, double height,String color, boolean isFilled) {
        this.setWidth(width);
        this.setHeight(height);
        setColor(color);
        setFilled(isFilled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
    @Override
    public String toString(){
        return "A Rectangle with width="
                +this.getWidth()
                +", height="
                +this.getHeight()
                +", which is subclass of "
                + super.toString();
    }
}

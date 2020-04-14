public class Shape {
    private String color = "green";
    private boolean isFilled = true;

    public Shape() {}

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return isFilled;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
    @Override
    public String toString() {
        return "A Shape with \""
                + color
                + "\" color and "
                +
                (isFilled == false ? "not fill" : "filled");
    }
}

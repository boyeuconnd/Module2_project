public class Cirle {
    private double radius;
    private String color;
    protected String type = "Circle";
    public  Cirle(){

    }
    public Cirle(double radius,String color){
        this.radius = radius;
        this.color=color;

    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }
    @Override
    public String toString(){
        double area = Math.ceil(this.getArea()*100)/100;
        double peri = Math.ceil(this.getPerimeter()*100)/100;
        return "A "+ this.type
                +" with radius:"
                +this.getRadius()
                +", color:"
                +this.getColor()
                +", have Area:"
                + area
                +", Perimeter:"
                + peri;
    }



}

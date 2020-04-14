public class Cylinder extends Cirle {
    private double height;
    private String type = "Cylinder";
    public Cylinder(){

    }
    public Cylinder(double radius, String color, double height){
        setRadius(radius);
        setColor(color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVol(){
        return this.getArea()*this.getHeight();
    }
    @Override
    public String toString(){
        super.type = this.type;
        double vol = Math.ceil(this.getVol()*100)/100;
        return super.toString()
                +", Volume:"
                +vol;
    }

}

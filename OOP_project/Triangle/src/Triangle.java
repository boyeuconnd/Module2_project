public class Triangle extends Shape {
    private double side1=1, side2=1, side3=1;
    Triangle(){}
    Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public void setSide(double side1,double side2,double side3){
        this.setSide1(side1);
        this.setSide2(side2);
        this.setSide3(side3);
    }
    public double getPerimeter(){
        return this.side1+this.side2+this.side3;
    }
    public double getHalfPeri(){
        return getPerimeter()/2;
    }
    public double getArea(){
        double area = Math.sqrt(this.getHalfPeri()
                                    *(this.getHalfPeri()-this.side1)
                                    *(this.getHalfPeri()-this.side2)
                                    *(this.getHalfPeri()-this.side3));
        //Công thức Heron tính S tam giác với chiều dài 3 cạnh
        area = Math.ceil(area*1000)/1000;
        return area;
    }
    @Override
    public String toString(){
        return "A Triangle with color:"
                +super.getColor()+" and "
                +(super.getFilled() == false ? "not fill" : "filled")+"\n"
                +"side1:"+this.getSide1()
                +" side2:"+this.getSide2()
                +" side3:"+this.getSide3() +"\n"
                +"Perimeter:"+this.getPerimeter()
                +" Area:"+this.getArea();
    }
}

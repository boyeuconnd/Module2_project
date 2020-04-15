public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0]=new Circle(3);
        shapes[1]=new Rectangle(5,8);
        shapes[2]=new Circle(3,"red",true);
        shapes[3]=new Square(8);
        shapes[4]=new Square(6,"gray",false);
        for (int i =0;i<5;i++){
            if(shapes[i] instanceof Square){
                Square hinhvuong = (Square) shapes[i];
                System.out.println(hinhvuong);
                hinhvuong.howToColor();
            }else {
                System.out.println(shapes[i]);
            }

        }
    }
}

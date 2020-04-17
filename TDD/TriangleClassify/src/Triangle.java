import com.sun.jdi.ObjectCollectedException;

public class Triangle {
    private static int side1;
    private static int side2;

    public static int getSide1() {
        return side1;
    }

    public static int getSide2() {
        return side2;
    }

    public static int getSide3() {
        return side3;
    }

    private static int side3;

    public static void setSide1(int sideLength) {
        Triangle.side1 = sideLength;
    }

    public static void setSide2(int sideLength) {
        Triangle.side2 = sideLength;
    }

    public static void setSide3(int sideLength) {
        Triangle.side3 = sideLength;
    }

    public static String TriangleClassify(){
        int perimeter = side1+side2+side3;
        if(isNonTriangle()){
            return "non-triangle";
        }else if(isEquilateralTriangle()){
            return "equilateral";
        }else if(isIsoscelesTriangle()){
            return "isosceles";
        }else if(isNormalTriangle()){
            return "normal";
        }else throw new ObjectCollectedException();
    }

    public static boolean isEquilateralTriangle() {
        return side1 == side2 && side2 ==side3;
    }

    public static boolean isIsoscelesTriangle() {
        if(isNonTriangle()){
            return false;
        }else if(side1==side2||side1 ==side3||side2==side3){
            return true;
        }else return false;
    }
    public static boolean isNormalTriangle() {
        if(isNonTriangle()){
            return false;
        }else if(side1!=side2
                && side1!=side3
                && side2!=side3){
            return true;
        }else return false;
    }

    public static boolean isNonTriangle() {
        double perimeter = side1+side2+side3 ;
        if(side1<=0||side2<=0||side3<=0){
            return true;
        }else if(side1>=perimeter/2||side2>=perimeter/2||side3>=perimeter/2){
            return true;
        }else return false;
    }
    public static boolean isTriangle = !isNonTriangle();

}

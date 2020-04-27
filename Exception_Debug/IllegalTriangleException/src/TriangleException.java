import java.util.Scanner;

public class TriangleException {
    public static void CheckTriangle(int side1, int side2, int side3){
            if(side1<0||side2<0||side3<0){
                throw new ArithmeticException("Minus side");
            }else if(side1+side2<=side3||side1+side3<=side2||side2+side3<=side1){
                throw new ArithmeticException("Valid side value");
            }else {
                System.out.println("Is triangle!");
            }
    }

    public static void main(String[] args) {
        try{Scanner scn = new Scanner(System.in);
            System.out.print("Enter side1:");
            int side1 = scn.nextInt();
            System.out.print("Enter side2:");
            int side2 = scn.nextInt();
            System.out.print("Enter side3:");
            int side3 = scn.nextInt();
            CheckTriangle(side1,side2,side3);
        }catch (ArithmeticException e){
            System.err.print("Exception: " + e.getMessage());
        }

    }
}

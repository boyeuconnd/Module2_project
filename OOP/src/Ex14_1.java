import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scn.nextDouble();
        System.out.print("Enter the height: ");
        double height = scn.nextDouble();
        Rectangle hinhcn = new Rectangle(width,height);
        System.out.println("Your Rectangle: "+hinhcn.display());
        System.out.println("Area of the Rectangle: "+hinhcn.getArea());
        System.out.println("Perimeter of the Rectangle: "+hinhcn.getPerimeter());

    }
}

import java.util.Arrays;

public class Enforcement {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println("The point position: "+point.toString());
        point.setXY(2.5f,4.7f);
        System.out.println("The point position: "+point.toString());
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println("The point position: "+moveablePoint.toString());
        moveablePoint.setXY(10.0f,10.0f);
        System.out.println("New position after setter:"+Arrays.toString(moveablePoint.getXY()));
        moveablePoint.setxSpeed(-2);
        moveablePoint.setySpeed(4);
        System.out.println("The speed now: "+ Arrays.toString(moveablePoint.getSpeed()));
        moveablePoint.move(1);
        System.out.println("New position after move:"+Arrays.toString(moveablePoint.getXY()));

    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0]= new Circle(10,"pink",true);
        circles[1]= new Circle(100);
        circles[2]= new Circle(1000);

        System.out.println("Before resize:");
        for (Circle cir:circles
             ) {
            System.out.println(cir);
        }

        circles[0].resize(10);
        circles[1].resize(30);
        circles[2].resize(40);

        System.out.println("After resize:");
        for (Circle cir:circles
        ) {
            System.out.println(cir);
        }


    }
}

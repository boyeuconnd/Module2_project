import java.util.ArrayList;

public class Main extends BinarySearch{
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(1);
        myArray.add(8);
        myArray.add(20);
        myArray.add(35);
        myArray.add(40);
        myArray.add(60);
        myArray.add(66);
        myArray.add(71);
        myArray.add(85);
        myArray.add(90);
        myArray.add(99);
        myArray.add(100);
        myArray.add(120);
        myArray.add(160);
        System.out.println(BinarySearch(myArray,161));
    }
}

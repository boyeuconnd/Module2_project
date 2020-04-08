import java.util.Scanner;

public class MoneyConvert {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Enter USD value");
        double USD = scn.nextDouble();
        double VND = USD * rate;
        System.out.println("Your money in VND: "+VND);
    }
}


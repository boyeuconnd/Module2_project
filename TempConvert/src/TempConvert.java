import java.util.Scanner;

public class TempConvert {
    public static double cel_to_fah(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fah_to_cel(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int choice = -1;
        do{
            System.out.println("===Menu===");
            System.out.println("1: Celsius to Fahrenheit");
            System.out.println("2: Fahrenheit to Celsius");
            System.out.println("0: Exit");
            System.out.print("Now! Enter your choice: ");
            choice = scn.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter Celsius: ");
                    double celsius = scn.nextDouble();
                    System.out.println("Fahrenheit: "+ cel_to_fah(celsius));
                    break;
                case 2:
                    System.out.print("Enter Fahrenheit: ");
                    double fahrenheit = scn.nextDouble();
                    System.out.println("Celsius: "+ fah_to_cel(fahrenheit));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Your choice not valid, try again:");
            }

        }while (choice != 0);
    }
}

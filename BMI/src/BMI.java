import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("Enter your weight(in kg): ");
        weight = scn.nextDouble();
        System.out.print("Enter your height(in meter): ");
        height = scn.nextDouble();
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        bmi = weight / Math.pow(height, 2);

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}

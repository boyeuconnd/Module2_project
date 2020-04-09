import java.util.Scanner;

public class IntersetRate {
    public static void main(String[] args) {
        double money = 1.0,interset_rate = 1.0;
        int month = 1;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        money = scn.nextDouble();
        while (money<0){
            System.out.print("Investment amount not valid! Enter again: ");
            money = scn.nextDouble();
        };
        System.out.print("Enter number of months: ");
        month = scn.nextInt();
        while (month<1){
            System.out.print("Months not valid! Enter again: ");
            month = scn.nextInt();
        };
        System.out.print("Enter annual interest rate in percentage: ");
        interset_rate = scn.nextDouble();
        while (interset_rate<0){
            System.out.print("Interset rate not valid! Enter again: ");
            interset_rate = scn.nextDouble();
        };
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 * 3;
        }
        System.out.println("Total of interset: " + total_interset);




    }
}

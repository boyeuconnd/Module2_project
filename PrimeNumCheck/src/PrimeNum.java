import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number");
        int number = scn.nextInt();
        if(number<2){
            System.out.println(number + " is not a prime number.");
        }else {
            int i = 2;
            boolean check = true;
            while (i<=Math.sqrt(number)){
                if(number%i ==0)
                    check = false;
                    break;

            }
            if(check)
                System.out.print(number+" is Prime number.");
            else
                System.out.println(number+" is not Prime number");;
        }
    }
}

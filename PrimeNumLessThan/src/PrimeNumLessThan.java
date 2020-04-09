import java.util.Scanner;

public class PrimeNumLessThan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Maximum value num of prime num: ");
        short maxValue = scn.nextShort(),count = 0;
        int N =2;
        do{
            boolean check =true;
            int i=2;
            while (i<=Math.sqrt(N)){
                if(N%i == 0) {
                    check = false;
                    break;
                }else {
                    i++;
                }
            }
            if(check) {
                System.out.println(N);
                count++;
            }
            N++;

        }while (N<maxValue);
    }
}

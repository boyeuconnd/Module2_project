import java.util.Random;
import java.util.Scanner;

public class Enforcement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = scn.nextInt();
        int[] randomArray = new int[length];
        Random rdom = new Random();
        for (int element:randomArray
             ) {
            element = rdom.nextInt(1000);

        }
        System.out.printf("Made a random array with %4d elements value random under 1000 \n",length);
        StopWatch countdown = new StopWatch();
        countdown.start();
        for(int i = 0; i < length - 1; i++) {
            for(int j = i + 1; j < length; j++ ) {
                if(randomArray[i] > randomArray[j]) {
                    int temp = randomArray[i];
                    randomArray[i] = randomArray[j];
                    randomArray[j] = temp;
                }
            }
        }
        countdown.end();

        System.out.println("Total time to process soft mechanic: " +countdown.getElapsedTime() +" ms");
    }
}

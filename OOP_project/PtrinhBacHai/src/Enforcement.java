import java.util.Scanner;

public class Enforcement {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter value of a, b, c of format ax2 +bx+c =0");
        System.out.print("Enter a: ");
        a = scn.nextDouble();
        System.out.print("Enter b: ");
        b = scn.nextDouble();
        System.out.print("Enter c: ");
        c = scn.nextDouble();
        QuadraticEquation ptrinh_bac_hai = new QuadraticEquation(a,b,c);
        System.out.printf("a= %.2f /b= %.2f /c= %.2f \n",ptrinh_bac_hai.getA(),b,c);
        if(ptrinh_bac_hai.getDiscriminant()>0){
            System.out.printf("Phtrinh có 2 nghiệm: \n %.3f và %.3f",ptrinh_bac_hai.getRoot1(),ptrinh_bac_hai.getRoot2());
        }else if(ptrinh_bac_hai.getDiscriminant() == 0){
            System.out.printf("Phtrinh có 2 nghiệm bằng nhau: %.3f",ptrinh_bac_hai.getRoot1());
        }else {
            System.out.println("Phtrinh vo nghiem");
        }
    }
}

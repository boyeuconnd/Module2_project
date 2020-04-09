import java.util.Scanner;

public class MenuCreateV2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int choice = -1;
        while (choice != 4){
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scn.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Print the rectangle");
                    String draw="";
                    for(int j =0;j<3;j++){
                        for(int i=0;i<7;i++){
                            draw+="* ";
                        }
                        System.out.println(draw);
                        draw ="";
                    }
                    break;
                case 2:
                    System.out.println("Draw the square triangle");
                    draw ="";
                    for(int j=1;j<=5;j++){
                        for(int i=0;i<j;i++){
                            draw+="* ";
                        }
                        System.out.println(draw);
                        draw ="";
                    }
                    for(int i=5;i>=1;i-- ){
                        for(int j=1;j<=i;j++){
                            draw +="* ";
                        }
                        System.out.println(draw);
                        draw="";
                    }
                    for(int i=1;i<=5;i++ ){
                        for(int j=5;j>i;j--){
                            draw +="  ";
                        }
                        for(int k=0;k<i;k++){
                        draw +="* ";
                        }
                        System.out.println(draw);
                        draw="";
                    }
                    for(int i=1;i<=5;i++ ){
                        for(int j=1;j<i;j++){
                            draw +="  ";
                        }
                        for(int k=5;k>=i;k--){
                            draw +="* ";
                        }
                        System.out.println(draw);
                        draw="";
                    }

                break;

                case 3:
                    System.out.println("Print isosceles triangle");
                    draw ="";
                    for(int i=1;i<=5;i++ ){
                        for(int j=5;j>i;j--){
                            draw +="  ";
                        }
                        for(int k=0;k<2*i-1;k++){
                            draw +="* ";
                        }
                        System.out.println(draw);
                        draw="";
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No Choice");
            }
        }
    }
}

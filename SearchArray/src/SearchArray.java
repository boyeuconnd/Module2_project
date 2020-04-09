import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        String[] students = {"An","Binh","Chien","Duong","Hoa","Kieu","Loan","Tuan","Giang","Son"};
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a name's student ");
        String input_name = scn.nextLine();
        boolean isExist = false;
        for(int i =0;i<students.length;i++){
            if(students[i].equals(input_name)){
                isExist = true;
                System.out.println("Position of the student " + input_name+ " is " + (i+1));
                break;
            }
        }
        if(!isExist){
            System.out.println("Not found student "+ input_name +" in list.");
        }
    }
}

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] studentList;
        System.out.print("Enter total students in class: ");
        int size = scn.nextInt();
        do {
            if(size>30 || size <=1){
                System.out.print("Students amount fr 2 - 30 students, plz try again: ");
                size = scn.nextInt();
            }
        }while (size>30 || size <=1);
        studentList = new int[size];
        int i =0;
        while (i<studentList.length){
            System.out.printf("Enter the mark for student number %2d: ",(i+1));
            studentList[i] = scn.nextInt();
            do {
                if(studentList[i]<0 || studentList[i]>10){
                    System.out.printf("The mark for student number %2d is not valid! Enter again: ",(i+1));
                    studentList[i]=scn.nextInt();
                }
            }while (studentList[i]<0 || studentList[i]>10);
            i++;
        }
        int passedNum=0;
        System.out.print("List of marks");
        for(int j =0;j<size;j++){
            System.out.printf("Number %d with mark: %d \n",(j+1),studentList[j]);
            if(studentList[j]>=5){
                passedNum ++;
            }
        }
        System.out.println("Total students passed: "+passedNum);
    }

}

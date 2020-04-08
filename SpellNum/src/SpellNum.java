import java.util.Scanner;

public class SpellNum {
    public static void main(String[] args) {
        System.out.println("Enter number u want to spell.");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int unit;
        String spell_unit ="";

        String spell_num="";

        if(num <=10 && num >=0){
            unit = num;
            switch (unit){
                case 0:
                    spell_num = "zero";
                    break;
                case 1:
                    spell_num = "one";
                    break;
                case 2:
                    spell_num = "two";
                    break;
                case 3:
                    spell_num = "three";
                    break;
                case 4:
                    spell_num = "four";
                    break;
                case 5:
                    spell_num = "five";
                    break;
                case 6:
                    spell_num = "six";
                    break;
                case 7:
                    spell_num = "seven";
                    break;
                case 8:
                    spell_num = "eight";
                    break;
                case 9:
                    spell_num = "nine";
                    break;
                case 10:
                    spell_num = "ten";
                    break;
            }
        }else if(num < 20){
            unit = num%10;
            switch (num){
                case 11:
                    spell_num ="eleven";
                    break;
                case 12:
                    spell_num ="twelve";
                    break;
                case 13:
                    spell_num ="thirteen";
                    break;
                case 15:
                    spell_num ="fifteen";
                    break;
                case 14:
                    spell_num = "fourteen";
                case 16:
                    spell_num = "sixteen";
                    break;
                case 17:
                    spell_num = "seventeen";
                    break;
                case 18:
                    spell_num = "eighteen";
                    break;
                case 19:
                    spell_num = "nineteen";
                    break;

            }
        }else {
            spell_num = "Out of ability";
        }

        System.out.println(spell_num);
    }
}

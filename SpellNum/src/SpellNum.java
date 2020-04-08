import java.util.Scanner;

public class SpellNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scn.nextInt();
        String spell_num ="";
        if(num>=0 && num <=10){
            switch (num){
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
        }else if(num<20){
            switch (num){
                case 11:
                    spell_num = "eleven";
                    break;
                case 12:
                    spell_num = "twelve";
                    break;
                case 13:
                    spell_num = "thirteen";
                    break;
                case 14:
                    spell_num = "fourteen";
                    break;
                case 15:
                    spell_num = "fifteen";
                    break;
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
        }else if(num>=20 && num<1000) {
            int unit = num%10;
            int tens = (num/10)%10;
            int hunds = num/100;
            int ten_unit = num%100;
            switch (hunds){
                case 0:
                    spell_num="";
                    break;
                case 1:
                    spell_num = "one hundred";
                    break;
                case 2:
                    spell_num = "two hundreds";
                    break;
                case 3:
                    spell_num = "three hundreds";
                    break;
                case 4:
                    spell_num = "four hundreds";
                    break;
                case 5:
                    spell_num = "five hundreds";
                    break;
                case 6:
                    spell_num = "six hundreds";
                    break;
                case 7:
                    spell_num = "seven hundreds";
                    break;
                case 8:
                    spell_num = "eight hundreds";
                    break;
                case 9:
                    spell_num = "nine hundreds";
                    break;
            }

            switch (tens){
                case 1:
                    switch (ten_unit){
                        case 10:
                            spell_num += " ten";
                            break;
                        case 11:
                            spell_num += " eleven";
                            break;
                        case 12:
                            spell_num += " twelve";
                            break;
                        case 13:
                            spell_num += " thirteen";
                            break;
                        case 14:
                            spell_num += " fourteen";
                            break;
                        case 15:
                            spell_num += " fifteen";
                            break;
                        case 16:
                            spell_num += " sixteen";
                            break;
                        case 17:
                            spell_num += " seventeen";
                            break;
                        case 18:
                            spell_num += " eighteen";
                            break;
                        case 19:
                            spell_num += " nineteen";
                            break;
                    }
                    break;

                case 2:
                    spell_num += " twenty";
                    break;
                case 3:
                    spell_num += " thirty";
                    break;
                case 4:
                    spell_num += " fourty";
                    break;
                case 5:
                    spell_num += " fifty";
                    break;
                case 6:
                    spell_num += " sixty";
                    break;
                case 7:
                    spell_num += " seventy";
                    break;
                case 8:
                    spell_num += " eighty";
                    break;
                case 9:
                    spell_num += " ninety";
                    break;
            }
            switch (unit){
                case 0:
                    spell_num += "";
                    break;
                case 1:
                    if(tens != 1){
                        spell_num += " one";
                    }
                    break;
                case 2:
                    spell_num += " two";
                    break;
                case 3:
                    spell_num += " three";
                    break;
                case 4:
                    spell_num += " four";
                    break;
                case 5:
                    spell_num += " five";
                    break;
                case 6:
                    spell_num += " six";
                    break;
                case 7:
                    spell_num += " seven";
                    break;
                case 8:
                    spell_num += " eight";
                    break;
                case 9:
                    spell_num += " nine";
                    break;
                case 10:
                    spell_num += " ten";
                    break;
            }

        }else {
            spell_num = "Out of ability";
        }
        System.out.println("Your number is: "+ spell_num);
    }
}

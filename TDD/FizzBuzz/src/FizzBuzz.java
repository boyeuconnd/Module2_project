public class FizzBuzz {
    static String result = "";
    public static String getFizzBuzz(int num){
        String stringOfNum= String.valueOf(num);

        boolean isDivideTo3_5 = num % 3 == 0 && num % 5 == 0;
        boolean isDivideTo3 = num % 3 == 0;
        boolean isDivideTo5 = num % 5 == 0;
        if(isDivideTo3_5) {
            return "FizzBuzz";
        }else {
            if(isDivideTo3) {
                return "Fizz";
            }else if(isDivideTo5){
                return "Buzz";
            }else { //Not dividable
                result = notDividableCase(stringOfNum);
                return result;

            }
        }

    }

    private static String notDividableCase(String stringOfNum) {
        result="";
        for(int i =0;i<stringOfNum.length();i++){
            char charOfString = stringOfNum.charAt(i);
            if(charOfString =='3'){
                result= "Fizz";
                break;
            }else if(charOfString =='5'){
                result = "Buzz";
                break;
            }else result += charReader(charOfString);
        }
        return result;
    }
    private static String charReader(char charOfString){
        String tempString="";
        switch (charOfString){
            case '1':
                tempString ="mot ";
                break;
            case '2':
                tempString ="hai ";
                break;
            case '3':
                tempString ="ba ";
                break;
            case '4':
                tempString ="bon ";
                break;
            case '5':
                tempString ="nam ";
                break;
            case '6':
                tempString ="sau ";
                break;
            case '7':
                tempString ="bay ";
                break;
            case '8':
                tempString ="tam ";
                break;
            case '9':
                tempString ="chin ";
                break;
            case '0':
                tempString ="khong ";
                break;
        }
        return tempString;
    }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneRegex {
    private static String PHONE_REGEX ="[(]\\d{2,}[)][-][(][0]\\d{9}[)]";
    public PhoneRegex(){}
    public boolean Validable (String number){
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}

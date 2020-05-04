import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASS_NAME_REGEX ="^[CAP]\\d{4}[GHIKLM]$";
    public ClassName(){}
    public boolean validable(String regex){
        /** tạo 1 pattern compile với Regex có sẵn**/
        Pattern ptern = Pattern.compile(CLASS_NAME_REGEX);
        /** Tạo biến match kiểm tra thích tương thích giữa chuỗi nhập vào với pattern vừa tạo**/
        Matcher match = ptern.matcher(regex);
        return match.matches();
    }
}

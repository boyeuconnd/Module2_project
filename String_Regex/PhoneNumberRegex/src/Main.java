public class Main {
    private static PhoneRegex phoneRegex;
    public static final String[] VALID = {"(84)-(0978489648)","(84)-(0829427568)","(377)-(0853885679)"};
    public static final String[] INVALID = {"(a4)-(0978489648)","(84)-(2222222222)","(@77)-(0853885679)","(677)-(085388567)"};

    public static void main(String[] args) {
        phoneRegex = new PhoneRegex();
        for (String element:VALID) {
            boolean isValid = phoneRegex.Validable(element);
            System.out.println("Phone num: "+element+" is valid: "+ isValid);

        }
        for (String element:INVALID) {
            boolean isValid = phoneRegex.Validable(element);
            System.out.println("Phone num: "+element+" is valid: "+ isValid);

        }
    }
}

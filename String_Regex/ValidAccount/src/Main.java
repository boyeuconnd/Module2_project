public class Main {
    private static AccountSample accountSample;

    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String args[]) {
        accountSample = new AccountSample();
        for (String account : validAccount) {
            boolean isvalid = accountSample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = accountSample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
}

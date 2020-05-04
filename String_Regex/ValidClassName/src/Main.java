public class Main {
    private static ClassName className;
    public static final String[] VALID = {"C0220I","C0919H","A0420G","P0520M"};
    public static final String[] INVALID ={"D0220I","C089H","A0467W","A@0620"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String element: VALID ) {
            boolean isValid =className.validable(element);
            System.out.println("Class name "+element+" is valid: " + isValid);

        }
        for (String element: INVALID ) {
            boolean isValid =className.validable(element);
            System.out.println("Class name "+element+" is valid: " + isValid);

        }
    }
}

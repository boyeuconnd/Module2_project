public class SimpleCalculator {
    public static int add(int first, int second){
        if (first  + second  >= Integer.MAX_VALUE ) {
            throw new RuntimeException("Out of range exception");
        }
        return first + second;
    }

    public static int sub(int first, int second){
        return first - second;
    }
}



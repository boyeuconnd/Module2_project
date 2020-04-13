public class Enforcement {
    public static void main(String[] args) {
        //Create object fanNo1 and setup information
        Fan fanNo1 = new Fan();
        fanNo1.setStatus();
        fanNo1.setColor("Yellow");
        fanNo1.setRadius(10);
        fanNo1.setSpeed(fanNo1.FAST);
        fanNo1.toStringFan();
        //Create object fanNo2 and setup information
        Fan fanNo2 = new Fan();
        fanNo2.setSpeed(fanNo2.MEDIUM);
        fanNo2.setRadius(5);
        fanNo2.setColor("Blue");
        fanNo2.toStringFan();

    }
}

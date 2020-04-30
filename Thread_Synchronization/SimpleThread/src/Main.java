public class Main {
    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator();
        int max = Thread.MAX_PRIORITY;
        int min = Thread.MIN_PRIORITY;

        Thread t1 = new Thread(){
            public void run(){
                num1.printNumEven();
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                num1.printNumOdd();
            }
        };

        t1.setPriority(max) ;
        t2.setPriority(min);
        System.out.println("Thread1 priority: "+t1.getPriority());
        System.out.println("Thread2 priority: "+t2.getPriority());
        t1.start();
        t2.start();
    }
}

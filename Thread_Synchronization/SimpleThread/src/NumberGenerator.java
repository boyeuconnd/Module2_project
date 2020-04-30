public class NumberGenerator implements Runnable {
     public void printNumEven(){

        try {
            for(int i =1;i<=10;i++){
                System.out.println(i*2);

                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
     public void printNumOdd(){

        try {
            for(int i =1;i<=10;i++){
                System.out.println(i*2+1);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        try {
            for(int i =1;i<=10;i++){
                System.out.println(i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

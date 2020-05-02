public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int count=0;

                for(int N=2;count<100;N++){
                    boolean check =true;
                    int i=2;
                    while (i<N){
                        if(N%i == 0) {
                            check = false;
                            break;
                        }else {
                            i++;
                        }
                    }
                    if(check) {
                        System.out.println(N+" - LazyFactor");
                        count++;
                    }
                }

    }
}

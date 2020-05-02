public class OptimizedPrimeFactorization implements Runnable  {
    @Override
    public void run() {
        int count=0;

        for(int N=2;count<100;N++){
            boolean check =true;
            int i=2;
            while (i<=Math.sqrt(N)){
                if(N%i == 0) {
                    check = false;
                    break;
                }else {
                    i++;
                }
            }
            if(check) {
                System.out.println(N+" - OptimizeFactor");
                count++;
            }
        }


    }
}

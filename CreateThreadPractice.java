public class CreateThreadPractice {
    private  static   class P1 extends  Thread{
        private int  count=100_0000;
        @Override
        public void run(){
            long sum=0;
            for (int i = 1; i <= count; i++) {
                sum+=i;
            }
            System.out.println("1+2+3+....+i:"+sum);
        }
    }
    private static class  P2 extends  Thread{
        private  int count=100_0000;
        @Override
        public void run(){
            long sum=0;
            for (int i = 1; i <=count; i+=2) {
               sum+=i;
            }
            System.out.println("P1:1+3+5+7.....+i="+sum);
        }
    }

    private static class P3 extends  Thread{
        private int count=100_0000;
        @Override
        public void run(){
            long sum=0;
            for(int i=0;i<=count;i+=2){
                sum+=i;
            }
            System.out.println("0+2+4+...+count:"+sum);
        }
    }

    public static void main(String[] args) {
        Thread thread1=new Thread();
        Thread thread2=new P2();
        Thread thread3=new P3();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

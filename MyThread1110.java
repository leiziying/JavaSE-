public class MyThread1110 {
    public static void main(String[] args) {
     MyThread1 mt1=new MyThread1();
        MyThread2 mt2=new MyThread2();
        MyThread3 runnable=new MyThread3();
        Thread mt3=new Thread(runnable);
        mt1.start();
        mt2.start();
        mt3.start();
    }
    public static class  MyThread1 extends  Thread{
        @Override
        public void  run(){
            long sum=0;
            for (int i = 1; i <=100_0000 ; i++) {
                sum+=i;
            }
            System.out.println("1+2+3+.....+1000000:"+sum);
        }
    }
    public static class  MyThread2 extends Thread {
        long sum=0;
        @Override
        public void run(){
            for (int i = 1; i <=100_0001 ; i+=2) {
                sum+=i;
            }
            System.out.println("1+3+5+...100_0001:"+sum);
        }
    }
    public static class  MyThread3 implements  Runnable{
        long sum=0;
        @Override
        public void run(){
            for (int i = 1; i <=100_0000 ; i++) {
                sum+=Math.pow(i,2);
            }
            System.out.println("1^2+2^2+3^2+...100_0000^2:"+sum);
        }
    }
}

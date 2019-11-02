public class CreateThread1 {
    private static class MyThread extends  Thread{
        private int n=0;
        @Override
        public void run(){
           while(n<60){
                System.out.println(n);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                n++;
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1=new Thread(new MyThread());
        Thread thread2=new Thread(new MyThread());
        thread1.start();
        thread2.start();
    }
}

public class Test1110 {
    public static void main(String[] args) {
        /*System.out.println(Thread.currentThread().getName());*/
          Thread mt=new MyThread();
          mt.start();
          MyThread2 runnable=new MyThread2();
          Thread mt2=new Thread(runnable);
          mt2.start();

    }
    public static  class  MyThread extends  Thread{
        @Override
        public void run(){
            for (int i = 0; i <20 ; i++) {
                System.out.println(Thread.currentThread().getName()+"-->"+i);
               /* try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }
        }
    }
    public  static class  MyThread2   implements  Runnable{
        @Override
        public void run(){
            for (int i = 0; i <20 ; i++) {
                System.out.println(Thread.currentThread().getName()+"-->"+i);
            }
        }
    }


}

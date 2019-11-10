public class ThreadName {
    private static class  MyThread extends  Thread{
        public MyThread(String name){
            super(name);
        }
        public MyThread(){

        }
        @Override
        public  void run(){
            while (true){
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        MyThread mt=new MyThread("我是AAA");
        mt.start();
        MyThread mt2=new MyThread("我是BBB");
        mt2.start();
    }
}

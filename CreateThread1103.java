public class CreateThread1103 {
    private static class MyThread extends  Thread{
        private int n=0;
        @Override
        public void run(){
            while(n<10){
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
    private static class ShareResource{
        public int n=0;
    }

    private static class MyThread2 extends  Thread{
        private ShareResource  resource;
        MyThread2(ShareResource resource){
            this.resource=resource;
        }
        @Override
        public void run(){
            while(resource.n<10){
                System.out.println(resource.n);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                resource.n++;
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1=new MyThread();
        Thread thread2=new MyThread();


    }
}

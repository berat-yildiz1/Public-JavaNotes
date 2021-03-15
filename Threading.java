public class Main {

    public static void main(String[] args) {
            KronometreThread thread1=new KronometreThread("thread1");
        KronometreThread thread2=new KronometreThread("thread2");
        KronometreThread thread3=new KronometreThread("thread3");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
////////////////////////////////////////
public class KronometreThread implements  Runnable{

    private Thread thread;// library object -threat
    private String threadName;

    public KronometreThread(String threadName){
        this.threadName=threadName;
        System.out.println("Oluşturuluyor :"+threadName);
    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor: "+threadName);
        try {
        for (int i=1;i<=10;i++)
                {
            System.out.println(threadName+" : "+i);

                Thread.sleep(1000);
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("threat bitti"+threadName);
            }

    public void start(){
        System.out.println("threat object creating");
        if(thread==null){
            thread = new Thread(this,threadName);
            thread.start();
        }

    }

}

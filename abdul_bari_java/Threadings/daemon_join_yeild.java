package abdul_bari_java.Threadings;
class MyThreaded extends Thread{
    @Override
    public void run() {
        int i =1;
        while(true){
            System.out.println(i++ +"My Thread");
        }
    }
}
public class daemon_join_yeild {
    public static void main(String[] args) throws Exception {
        MyThreaded myThreaded = new MyThreaded();
       // myThreaded.setDaemon(true);
        myThreaded.start();
        //Thread MainThread = Thread.currentThread();
        //MainThread.join();
        /*try {
            Thread.sleep(100);
        }
        catch (Exception e){}*/
        int count=1;
        while (true){
            System.out.println(count++ +"Main");
            Thread.yield();
        }
    }
}

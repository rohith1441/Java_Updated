package abdul_bari_java.Threadings;
class MyThreadd extends Thread{
    public MyThreadd(String name){
        super(name);
        //setPriority(Thread.MAX_PRIORITY);
    }

    @Override
    public void run() {
        int count =1;
        while (true){
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) throws Exception{
        /*
        System.out.println("ID: "+t.getId());
        System.out.println("NAME: "+t.getName());
        System.out.println("PRIORITY: "+t.getPriority());

        System.out.println("STATE: "+t.getState());
        System.out.println("ALIVE: "+t.isAlive());*/
        MyThreadd t = new MyThreadd("My thread 1");
        t.start();
        t.interrupt();
    }
}

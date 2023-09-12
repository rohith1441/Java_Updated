package abdul_bari_java.Threadings;
class MyData{
    synchronized public void display(String str){
        for(int i =0; i<str.length();i++){
            System.out.print(str.charAt(i));
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Thread1 extends Thread{
    MyData data;
    public Thread1(MyData dat){
        data=dat;
    }

    @Override
    public void run() {
        data.display("Hello World");
    }
}

class Thread2 extends Thread{
    MyData dataa;
    public Thread2(MyData dat){
        dataa=dat;
    }

    @Override
    public void run() {
        dataa.display("Welcome");
    }
}
public class SyncDemo {
    public static void main(String[] args) {
        MyData d = new MyData();
        Thread1 thread1 = new Thread1(d);
        Thread2 thread2 = new Thread2(d);
        thread1.start();
        thread2.start();
    }
}

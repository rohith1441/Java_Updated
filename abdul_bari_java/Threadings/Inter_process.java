package abdul_bari_java.Threadings;
class something{
    int value;
    boolean flag= true;
    synchronized public void set(int v){
        while (flag!=true){
            try {wait();}catch (Exception e){}
        }
        value = v;
        flag = false;
        notify();
    }
    synchronized public int get(){
        int x=0;
        while (flag!=false){
            try {wait();}catch (Exception e){}
        }
        x=value;
        flag=true;
        notify();
        return x;
    }
}
class Producer extends Thread{
    something s;
    public Producer(something st){
        s=st;
    }

    @Override
    public void run() {
        int count=0;
        while (true){
            s.set(count);
            System.out.println("Producer: "+count);
            count++;
        }
    }
}
class Consumer extends Thread{
    something s;
    public Consumer(something st){
        s=st;
    }

    @Override
    public void run() {
        int count=0;
        int value;
        while (true){
            value=s.get();
            System.out.println("Consumer: "+value);
        }
    }
}
public class Inter_process {
    public static void main(String[] args) {
        something ss = new something();
        Producer p = new Producer(ss);
        Consumer c = new Consumer(ss);

        p.start();
        c.start();
    }
}

package abdul_bari_java.Threadings;

public class runnable_same_class implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        runnable_same_class m =  new runnable_same_class();
        Thread t = new Thread(m);
        t.start();
        int j =1;
        while (true){
            System.out.println(j+"World");
            j++;
        }
    }
}

package abdul_bari_java.Threadings;

public class example_using_diffferent_class extends Thread{
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i+"Hello");
            i++;
        }
        }
}

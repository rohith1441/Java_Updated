package abdul_bari_java.Threadings;
class My implements Runnable{
    @Override
    public void run() {
        int i = 1;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }
}

public class runnable_example_diff_class {
    public static void main(String[] args) {
        My m =  new My();
        Thread t = new Thread(m);
        t.start();
        int j =1;
        while (true){
            System.out.println(j+"World");
            j++;
        }
    }
}

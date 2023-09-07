package abdul_bari_java.Threadings;
class MyThread extends Thread{
    @Override
    public void run() {
        int i = 1;
        while (true){
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class example_using_diffferent_class_main {
    public static void main(String[] args) {
        //example_using_diffferent_class exampleUsingDiffferentClass = new example_using_diffferent_class();
        //exampleUsingDiffferentClass.start();
        MyThread myThread = new MyThread();
        myThread.start();
        int j = 1;
        while (true){
            System.out.println(j+"World");
            j++;
        }
    }
}

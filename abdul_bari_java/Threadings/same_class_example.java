package abdul_bari_java.Threadings;

public class same_class_example extends Thread{
    @Override
    public void run() {
        int i = 1;
        while(true){
            System.out.println(i+"Rohith");
            i++;
        }
    }

    public static void main(String[] args) {
        same_class_example sameClassExample = new same_class_example();
        sameClassExample.start();
        int j=1;
        while (true){
            System.out.println(j+"Vivek");
            j++;
        }
    }
}

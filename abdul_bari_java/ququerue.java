package abdul_bari_java;

import java.util.PriorityQueue;
import java.util.Queue;

public class ququerue {
    public static void main(String[] args) {

        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(21);
        q1.add(23);
        q1.add(33);
        q1.remove();
        System.out.println(q1);
    }
}

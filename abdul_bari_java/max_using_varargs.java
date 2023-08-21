package abdul_bari_java;

import java.util.Arrays;

public class max_using_varargs {
    static void max_of(int ...A){
        int max = A[0];
        for (int j : A) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        max_of(22,234,5,3,45,12,5,43,54);
    }
}

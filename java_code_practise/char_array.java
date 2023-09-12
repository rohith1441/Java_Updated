package java_code_practise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class char_array {
    public static void main(String[] args) {
        String str = "Rohith";
        char[] c = str.toCharArray();
        char[] d = new char[str.length()];
        System.out.println(c);
        for (int i = c.length - 1, j = 0; i >= 0 || j < c.length; i--, j++) {
            d[j] = c[i];
        }
        System.out.println(d);
    }
}


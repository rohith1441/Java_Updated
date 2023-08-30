package abdul_bari_java.exceptionhandling;

import java.util.Scanner;

public class multi_exceptions {
    public static void main(String[] args) {
        int[] a = {12, 20, 20, 0, 40};
        try {
            int c = a[1] / a[4];
            System.out.println(c);
            try {
                System.out.println(a[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid");
            }
        }
        catch (ArithmeticException e1) {
                System.out.println(e1.getMessage());}
        }

}





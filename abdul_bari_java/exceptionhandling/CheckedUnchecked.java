package abdul_bari_java.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedUnchecked {
    static class LowBalanceException extends Exception{
        @Override
        public String toString() {
            return "Balance should not ne less than 5000";
        }
    }
    static void fun1() /*throws FileNotFoundException*/ {
        /*try {
            System.out.println(10/0);
        }
       catch (Exception e){
           System.out.println( e.getMessage());
           FileInputStream fi = new FileInputStream("My.txt");
        }*/
        try{
        throw new LowBalanceException();
    }catch (LowBalanceException e){
            System.out.println(e);
        }
    }
    static void fun2(){
        //fun1();
    }
    static void fun3(){
        fun2();
    }
    public static void main(String[] args) {
        fun3();
    }
}

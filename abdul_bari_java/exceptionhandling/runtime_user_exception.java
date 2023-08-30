package abdul_bari_java.exceptionhandling;

import java.util.Scanner;

public class runtime_user_exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
        int c=b/a;
        System.out.println("Result:"+c);}
        catch (Exception e){
            System.out.println("Exception is: "+e);
        }
    }
}

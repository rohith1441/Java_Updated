package abdul_bari_java.exceptionhandling;

import java.util.Scanner;

public class throw_exception {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = x/y;
        System.out.println(z);

    }
}

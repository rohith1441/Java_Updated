package abdul_bari_java;

import java.util.Locale;
import java.util.Scanner;

public class Menu_switch {
    public static void main(String[] args) {
        System.out.println("1. ADD\n" +
                "2. SUB\n"+
                "3. MUL\n"+
                "4. DIV");
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter an option in words");
        String option = sc.nextLine();
        option=option.toUpperCase();
        switch (option) {
            case "ADD":
                System.out.println("sum:" + (x + y));
                break;
            case "SUB":
                System.out.println("sub:" + (x - y));
                break;
            case "MUL":
                System.out.println("product:" + (x * y));
                break;
            case "DIV":
                System.out.println("result:" + (x / y));
                break;
            default:
                System.out.println("Enter the correct option");
        }
    }
}

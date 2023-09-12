package abdul_bari_java;

import java.util.Scanner;

public class looping_switch {
    public static void main(String[] args) {
        System.out.println("1 View Balance"+"\n2 Withdraw Funds"+"\n3 Deposit Funds"+"\n4 Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int choice = scanner.nextInt();
        while (choice != 4) {
            //System.out.println("1 View Balance"+"\n2 Withdraw Funds"+"\n3 Deposit Funds"+"\n4 Exit");
            if (choice == 1) {
                System.out.println("choice 1");
                break;
            } else if (choice == 2) {
                System.out.println("choice 2");
                break;
            } else if (choice == 3) {
                System.out.println("Choice 3");
                break;
            } else if (choice == 4) {
                System.out.println("Thank You for using the application");
                break;
            } else {
                System.out.println("Enter the correct choice");
                System.out.println("1 View Balance"+"\n2 Withdraw Funds"+"\n3 Deposit Funds"+"\n4 Exit");
                System.out.print("Enter a number: ");
                choice = scanner.nextInt();
            }
        }
    }
}

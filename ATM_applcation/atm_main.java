package ATM_applcation;

import java.util.Scanner;

public class atm_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your account number: ");
        int account_num = scanner.nextInt();
        System.out.print("Enter your password: ");
        int pass = scanner.nextInt();
        atm user = new atm(account_num,pass);
    }
}

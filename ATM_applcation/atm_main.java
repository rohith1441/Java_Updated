package ATM_applcation;

import java.util.Scanner;

public class atm_main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your account number: ");
        String account_num = scanner.next();
        System.out.print("Enter your password: ");
        String pass = scanner.next();
        int count =1;
        atm user = new atm(account_num, pass);
    }
}

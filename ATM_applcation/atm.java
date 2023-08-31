package ATM_applcation;

import java.util.Scanner;

public class atm {
    private int account_number;
    private int password;
    private double saving_balance;

    public atm(int account_number, int password) {
        this.account_number = account_number;
        this.password = password;
        options_menu optionsMenu = new options_menu();
        if ((account_number == 9876543 && password == 9876) || (account_number == 8989898 && password == 1890)) {
            optionsMenu.setAmount(10000);
            optionsMenu.setSaving_amount(4000);
            optionsMenu.options();
        } else {
            System.out.println("Wrong Account Number or Password");
        }
    }
}


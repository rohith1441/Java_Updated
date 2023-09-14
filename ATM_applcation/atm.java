package ATM_applcation;

import java.util.Objects;

public class atm {
    private String account_number;
    private String password;
    private double saving_balance;

    public atm(String account_number, String password) throws Exception {
        this.account_number = account_number;
        this.password = password;
        options_menu optionsMenu = new options_menu();
        if ((Objects.equals(account_number, "9876543") && Objects.equals(password, "9876")) || (Objects.equals(account_number, "8989898") && Objects.equals(password, "1890"))) {
            optionsMenu.setAmount(10000);
            optionsMenu.setSaving_amount(4000);
            try{
            optionsMenu.options();}
            catch (Exception e){
                System.out.println("Enter from the options");
                optionsMenu.options();
            }

        } else {
            System.out.println("Wrong Account Number or Password");

        }
    }
}


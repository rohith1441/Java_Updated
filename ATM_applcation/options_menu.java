package ATM_applcation;

import java.util.Scanner;

public class options_menu {
    private double amount;
    private double saving_amount;
    public void options() throws Exception {
        System.out.println("Select your Account:");
        System.out.println("1 Checking Account" + "\n2 Saving Account" + "\n3 Exit");
        //System.out.print("Choice:");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        //int count=1;
        do{
        try {
            System.out.print("Choice:");
            choice = scanner.nextInt();
        } catch (Exception e) {
            }
        }while(choice==-1);
        //scanner.nextLine();
        choice = Integer.parseInt(String.valueOf(choice));
        String select = String.valueOf(choice);
        if ((select.equals("1"))) {
            CheckingAccount();
        } else if (select.equals("2")) SavingAccount();
        else if (select.equals("3")) {
            System.out.println("Thank You for using the application");
        } else {
            System.out.println("Enter the correct choice");
            options();
        }

    }

    public void setSaving_amount(double saving_amount) {
        this.saving_amount = saving_amount;
    }

    public double getSaving_amount() {
        return saving_amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void CheckingAccount() throws Exception{
        System.out.println("Checking Account:");
        System.out.println("1 View Balance"+"\n2 Withdraw Funds"+"\n3 Deposit Funds"+"\n4 Exit");
        System.out.print("Choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice=0;
        do{
        try{
            System.out.print("Choice: ");
            choice = scanner.nextInt();}catch (Exception e){
            System.out.println("Enter the correct choice");
        }
        }while(choice==-1);
        if(choice==1){
            View_Balance();
        } else if (choice==2){
            WithDraw();}
        else if (choice==3) Deposit();
        else if (choice==4){
            System.out.println("Thank You for using the application");
        }
        else{
            System.out.println("Enter the correct choice");
            CheckingAccount();
        }

    }
    public void View_Balance() throws Exception {
        double money = getAmount();
        System.out.println("Your balance is:"+money+"$");
        options();
    }

    public void WithDraw() throws Exception {
        System.out.println("Enter the amount you want to withdraw:");
        Scanner scanner = new Scanner(System.in);
        double with_amount = scanner.nextDouble();
        if(with_amount<0){
            System.out.println("You cannot withdraw negative amount");
            WithDraw();
        }
        else{
        System.out.println("Your account balance after withdrawal:"+(getAmount()-with_amount)+"$");
        setAmount(getAmount()-with_amount);
        options();}
    }

    public void Deposit() throws Exception {
        System.out.println("Enter the amount you want to deposit:");
        Scanner scanner = new Scanner(System.in);
        double depo_amount = scanner.nextDouble();
        if(depo_amount<0){
            System.out.println("You cannot deposit negative balance");
            Deposit();
        }
        else {
            System.out.println("Your account balance after withdrawal:" + (getAmount() + depo_amount) + "$");
            setAmount(getAmount() + depo_amount);
            options();
        }

    }

    public void SavingAccount() throws Exception {
        System.out.println("Saving Account: ");
        System.out.println("1 View Balance" + "\n2 Withdraw Funds" + "\n3 Deposit Funds" + "\n4 Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do{
        try {
            System.out.print("Choice: ");
            choice = scanner.nextInt();
        } catch (Exception e) {
            //scanner.nextInt();
            System.out.println("Enter the correct choice");
        }}while (choice==-1);

        if (choice == 1) {
            View_Balance_saving();
        } else if (choice == 2) {
            WithDraw_saving();
        } else if (choice == 3) Deposit_saving();
        else if (choice == 4) {
            System.out.println("Thank You for using the application");
        } else {
            System.out.println("Enter the correct choice");
            SavingAccount();
        }
    }
    public void View_Balance_saving(){
        double saving_balance=getSaving_amount();
        System.out.println("Your saving account balance is:"+saving_balance+"$");
    }

    public void WithDraw_saving() throws Exception {
        System.out.println("Enter the amount you want to withdraw:");
        Scanner scanner = new Scanner(System.in);
        double with_amount = scanner.nextDouble();
        if(with_amount<0){
            System.out.println("You cannot withdraw negative balance");
            WithDraw_saving();
        }
        else {
            System.out.println("Your account balance after withdrawal:" + (getSaving_amount() - with_amount) + "$");
            setSaving_amount(getSaving_amount() - with_amount);
            options();
        }
    }
    public void Deposit_saving() throws Exception {
        System.out.println("Enter the amount you want to Deposit:");
        Scanner scanner = new Scanner(System.in);
        double depo_amount = scanner.nextDouble();
        if (depo_amount < 0) {
            System.out.println(("You cannot deposit negative balance"));
            Deposit_saving();
        } else {
            System.out.println("Your account balance after withdrawal:" + (getSaving_amount() - depo_amount) + "$");
            setSaving_amount(getSaving_amount() - depo_amount);
            options();
        }
    }

}

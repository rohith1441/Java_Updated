package ATM_applcation;

import java.util.Scanner;

public class options_menu {
    private double amount;
    private double saving_amount;
    public void options(){
        System.out.println("Select your Account:");
        System.out.println("1 Checking Account"+"\n2 Saving Account"+"\n3 Exit");
        System.out.print("Choice:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice==1){
            CheckingAccount();
        } else if (choice==2) SavingAccount();
        else if (choice==3){
            System.out.println("Thank You for using the application");
        }
        else{
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

    public void CheckingAccount(){
        System.out.println("Checking Account:");
        System.out.println("1 View Balance"+"\n2 Withdraw Funds"+"\n3 Deposit Funds"+"\n4 Exit");
        System.out.print("Choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
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
    public void View_Balance(){
        double money = getAmount();
        System.out.println("Your balance is:"+money+"$");
        options();
    }

    public void WithDraw(){
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

    public void Deposit(){
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

    public void SavingAccount(){
        System.out.println("Saving Account: ");
        System.out.println("1 View Balance"+"\n2 Withdraw Funds"+"\n3 Deposit Funds"+"\n4 Exit");
        System.out.print("Choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice==1){
            View_Balance_saving();
        } else if (choice==2){
            WithDraw_saving();}
        else if (choice==3) Deposit_saving();
        else if (choice==4){
            System.out.println("Thank You for using the application");
        }
        else{
            System.out.println("Enter the correct choice");
            SavingAccount();
        }
    }
    public void View_Balance_saving(){
        double saving_balance=getSaving_amount();
        System.out.println("Your saving account balance is:"+saving_balance+"$");
    }

    public void WithDraw_saving(){
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
    public void Deposit_saving() {
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

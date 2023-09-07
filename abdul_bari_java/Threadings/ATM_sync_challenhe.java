package abdul_bari_java.Threadings;
class ATM{
    synchronized public void checkBalance(String name){
        System.out.print(name+" is checking");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);

        }
        System.out.println("Balance");
    }
    synchronized public void withDraw(String name, int amount){
        System.out.print(name+" is withdrawing"+" dollars");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
        }
        System.out.println(amount);
    }
}
class Customer extends Thread{
    ATM atm;
    String name;
    int amount;
    public Customer(String name, int amount, ATM atm){
        this.amount = amount;
        this.name = name;
        this.atm=atm;
    }
    public void UseAtm(){
        atm.checkBalance(this.name);
        atm.withDraw(this.name,this.amount);
    }

    @Override
    public void run() {
        UseAtm();
    }
}
public class ATM_sync_challenhe {
    public static void main(String[] args) {
        ATM atm1 = new ATM();
        Customer customer = new Customer("rohith",23,atm1);
        Customer customer1 = new Customer("vivek",43,atm1);
        customer.start();
        customer1.start();
    }

}

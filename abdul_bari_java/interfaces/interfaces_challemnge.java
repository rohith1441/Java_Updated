package abdul_bari_java.interfaces;
interface Member{
    void callback();
}
class Store{
    Member[] member = new Member[100];
    int count = 0;
    void register(Member member){
        this.member[count++] = member;

    }
    void invitesale(){
        for(int i =0;i<count;i++){
            member[i].callback();
        }
    }
}
class Customer implements Member{
    String name;
    public Customer(String name){
        this.name = name;
    }

    @Override
    public void callback() {
        System.out.println("OK, I will visit "+name);
    }
}
public class interfaces_challemnge {
    public static void main(String[] args) {
        Store store = new Store();
        Customer c1 = new Customer("Rohith");
        Customer c2 = new Customer("Vivek");
        store.register(c1);
        store.register(c2);
        store.invitesale();
    }
}

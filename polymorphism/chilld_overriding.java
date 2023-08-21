package polymorphism;

public class chilld_overriding extends parent{
    int date;
    public chilld_overriding(int date, String name, int age){
        super(name, age);
        this.date = date;
    }

    @Override
    public void sum(int a) {
        System.out.println("one number");
    }
    public void sum(int a, int b){
        System.out.println("two numbers");
    }

    public void sum(int a, int b, int c){
        System.out.println("Three numbers");
    }

}

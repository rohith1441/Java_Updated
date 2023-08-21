package polymorphism;

public class parent {
    String name;
    int age;
    public parent(String name, int age){
        this.age = age;
        this.name = name;
    }
    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void sum(int a, int b) {
        System.out.println(a + b);

    }
    public void sum(int a){
        System.out.println("enter one more number to add");}


    public static void main(String[] args) {
        parent parent1 = new parent("rohith",23);
        parent1.sum(2);
        parent1.sum(2,3);
        parent1.sum(2,3,4);

    }
}

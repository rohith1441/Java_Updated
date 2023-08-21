package polymorphism;

public class demo {
    public static void main(String[] args) {
        chilld_overriding child = new chilld_overriding(20,"ro",33);
        child.sum(2);
        child.sum(2,3);
        child.sum(2,3,4);
    }
}

package abdul_bari_java;
class parent {
    String name;

    public String showname(String name) {
        this.name = name;
        return name;
    }
}
class child extends parent{
    String child_name;
    public String showname(String name){
        child_name = name;
        return child_name;
    }
}
public class abstraction {
    public static void main(String[] args) {
        parent p1 = new child();
        //p1.name = "rohith";
        System.out.println(p1.showname("nahaafdsdf"));
    }

}

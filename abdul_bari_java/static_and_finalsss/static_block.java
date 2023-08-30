package abdul_bari_java.static_and_finalsss;
class Test{
    static int s;
    static {
        System.out.println("Block1");
        s=10;
    }
    static {
        System.out.println("Block2");
    }

}
public class static_block {

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("Main");
    }
}

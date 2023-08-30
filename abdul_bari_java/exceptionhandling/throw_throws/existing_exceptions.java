package abdul_bari_java.exceptionhandling.throw_throws;

public class existing_exceptions {
    static int division(int a, int b){
        int c = a/b;
        return c;
    }
    static void method2(){
        try{
        int r = division(10,3);
        System.out.println(r);}
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    static void method3(){
        method2();
    }

    public static void main(String[] args) {
        method3();
    }
}

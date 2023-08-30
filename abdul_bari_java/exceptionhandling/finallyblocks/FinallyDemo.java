package abdul_bari_java.exceptionhandling.finallyblocks;

public class FinallyDemo {
    static void meth1() throws Exception{
        try{
            throw new Exception();
        }
        finally{
            System.out.println("message");
        }
    }
    public static void main(String[] args)throws Exception {
        meth1();
        try {
        System.out.println(10/0);}
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Final Message");
        }
    }
}

package abdul_bari_java.exceptionhandling.throw_throws;
class NegativeDimensionException extends Exception{
    @Override
    public String toString() {
        return "Dimensions need to be greater than 0";
    }
}
public class rectangle_throw_throws {
    static int area(int l, int b) throws NegativeDimensionException{
        if(l<0 || b<0){
            throw new NegativeDimensionException();
        }
        return l*b;
    }
    static void meth1() throws NegativeDimensionException{
        System.out.println(area(10,5));
    }

    public static void main(String[] args){
        try{
        meth1();
    }catch (NegativeDimensionException e){
            System.out.println(e);
        }
    }

}

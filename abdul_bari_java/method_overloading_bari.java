package abdul_bari_java;

public class method_overloading_bari{
    public int max(){
        System.out.println("Enter some numbers:");
        return 0;
    }
    public int max(int x){
        System.out.println("Enter one more number: ");
        return x;
    }
    public int max(int x,int y){
        int sum=0;
        sum = x+y;
        //System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        method_overloading_bari over = new method_overloading_bari();
        over.max();
        over.max(5);
        System.out.println(over.max(5,10));
    }


}

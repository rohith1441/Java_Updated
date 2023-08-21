package abdul_bari_java;

public class sum_varargs {
    static void summ(int ...A){
        int sum =0;
        for(int i:A){
            sum = sum+i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        summ(1,2,3,4,53,647,47,435,3);
    }
}

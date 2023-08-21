package abdul_bari_java;

public class object_passing {
    static void change(int[] A){
        A[2]= 20;
    }
    static void change2(int x,int value){
        x=value;
    }
    public static void main(String[] args) {
        int[] A = {2,4,6,8,10};
        change(A);
        for(int x:A){
            System.out.println(x);
        }
        int x=10;
        change2(x,20);
        System.out.println(x);
    }
}


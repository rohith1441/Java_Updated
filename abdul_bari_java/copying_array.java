package abdul_bari_java;

public class copying_array {
    public static void main(String[] args) {
        int A[]={5,9,6,10,12,7,3,5,4,2};
        int B[]= new int[A.length];
        for(int i=0;i<B.length;i++){
            B[i]=A[i];
        }
        for(int e:B){
            System.out.print(e+",");
        }
    }
}

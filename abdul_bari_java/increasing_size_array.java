package abdul_bari_java;

public class increasing_size_array {
    public static void main(String[] args) {
        int A[]={8,6,10,9,2};
        int B[]=new int[2*A.length];
        for(int i=0; i<A.length;i++){
            B[i]=A[i];
        }
        A=B;
        B=null;
        for (int j=0; j<A.length;j++){
            System.out.print(A[j]+",");
        }
        System.out.println(A.length);
    }
}

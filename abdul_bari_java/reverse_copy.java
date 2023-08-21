package abdul_bari_java;

public class reverse_copy {
    public static void main(String[] args) {
        int A[]={5,9,6,10,12,7,3,5,4,2};
        int B[]= new int[A.length];
        for(int i=B.length-1,j=0;i>0  || j<B.length;i--,j++){
            B[j]=A[i];
        }
        for(int e:B){
            System.out.print(e+",");
        }
    }
}

package abdul_bari_java;

import java.util.Arrays;

public class rotating_array {
    public static void main(String[] args) {
        int A[]={5,9,6,10,12,7,3,5,4,2};
        int B[]={5,9,6,10,12,7,3,5,4,2};
        // Left Rotation
        int temp= A[0];
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
            System.out.println(A[i-1]);
        }
        A[A.length-1]=temp;
        for(int j=0;j<A.length;j++){
            System.out.print(A[j]+",");
        }
        System.out.println("");

        // Right Rotation
        int last=B[B.length-1];
        System.out.println(last);
        for(int k=B.length-1;k>0;k--){
            B[k]=B[k-1];
            //System.out.print(B[k]+" ");
        }
        B[0]=last;
        for(int l=0;l<B.length;l++){
            System.out.print(B[l]+",");
        }

    }
}

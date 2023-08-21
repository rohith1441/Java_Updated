package abdul_bari_java;

public class matrix_mult {
    public static void main(String[] args) {
        int A[][] = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
        int B[][] = {{1, 5, 2}, {6, 8, 4}, {3, 9, 7}};
        int C[][] = new int[A.length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j]=0;
                for (int k = 0; k < A[i].length; k++) {
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
            }
        for(int x[]:C){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("\n");
        }
    }
}

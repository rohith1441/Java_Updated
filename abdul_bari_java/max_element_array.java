package abdul_bari_java;

public class max_element_array {
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int max=A[0];
        for(int i=1; i<=A.length-1;i++){
            if(max<A[i]) {
                max = A[i];
            }
        }
        System.out.println(max);
    }
}

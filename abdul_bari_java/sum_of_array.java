package abdul_bari_java;

public class sum_of_array {
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int sum=0;
        for(int i=0;i<=A.length-1;i++){
            sum=sum+A[i];
        }
        System.out.println(sum);
    }


}

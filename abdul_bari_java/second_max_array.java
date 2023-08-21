package abdul_bari_java;

public class second_max_array {
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int max1=A[0],max2=A[0];
        for(int i=1; i<=A.length-1;i++){
            if(max1<A[i]){
                max2=max1;
                max1=A[i];

            }
            else if(max2<A[i]){
                max2=A[i];
            }
        }
        System.out.println(max2);

    }
}

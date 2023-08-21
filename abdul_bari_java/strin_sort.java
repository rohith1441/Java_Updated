package abdul_bari_java;

import java.util.Arrays;

public class strin_sort {
    public static void main(String[] args) {
        String arr[]={"java","python","pascal","smalltalk","ada","basic"};
        //java.util.Arrays.sort(arr);
        Arrays.sort(arr);
        for(String x:arr){
            System.out.print(x+" ");
        }
    }
}

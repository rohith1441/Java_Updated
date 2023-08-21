package abdul_bari_java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class search_in_array {
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        //int num=10;
        //for(int e:A){
        //    if(e==num){
        //        System.out.println("Found");
        //    }


        //    }
        //    else{
        //        System.out.println("Not Found"); //}
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the key to find");
        int key = scanner.nextInt();
        for(int i=0;i<=A.length-1;i++){
            if(A[i]==key)
                System.out.println("found at index"+i);
        }
        System.out.println("Not found");

    }
}

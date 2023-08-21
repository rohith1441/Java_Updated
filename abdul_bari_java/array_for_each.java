package abdul_bari_java;

import java.util.Scanner;

public class array_for_each {
    public static void main(String[] args) {
        int A[]= new int[8];
        int B[]={1,2,3,4,5,6,8,9};
        Scanner scanner = new Scanner(System.in);
        for(int m=0;m<A.length;m++){
            System.out.println("Enter the "+m+"element");
            A[m]=scanner.nextInt();
        }
        for (int i: A) {
            System.out.print(i);


        }
        System.out.println("");
        for(int k=A.length-1;k>=0;k--){
            System.out.print(A[k]);

        }
        System.out.println("");
        for(int j:B){
            System.out.print(j);
        }
    }
}

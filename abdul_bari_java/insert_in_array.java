package abdul_bari_java;

import java.util.Scanner;

public class insert_in_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[9];
        int num =6;
        int index=2;
        System.out.println("Enter elements of array:");
        for(int i=0;i<num;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println("before insertion");
        for(int el:a){

            System.out.print(el+",");
        }
        for(int j=num+1;j>index;j--){
            a[j]=a[j-1];
        }
        a[index]=10;
        System.out.println("");
        System.out.println("after insertion");
        for(int e:a){

            System.out.print(e+",");
        }


    }
}

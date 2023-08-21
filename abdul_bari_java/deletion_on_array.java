package abdul_bari_java;

import java.util.Scanner;

public class deletion_on_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[9];
        int num =6;
        int index=2;
        System.out.println("Enter elements of array:");
        for(int i=0;i<num;i++){
            a[i]=scanner.nextInt();
        }
        for(int i=index+1;i<num;i++){
            a[i-1]=a[i];
        }
        a[num-1]=0;
        for(int e:a){
            System.out.print(e+",");
        }
    }
}

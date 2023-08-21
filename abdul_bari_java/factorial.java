package abdul_bari_java;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        int product =1;
        for(int i=1;i<=num;i++){
            product = product*i;
            System.out.println(product);
        }
    }
}

package abdul_bari_java;

import java.util.Scanner;

public class mul_table_chal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        for (int i=0; i<=10;i++){
            System.out.println(i+"*"+number+" = "+(i*number));
        }
    }
}

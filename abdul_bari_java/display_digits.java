package abdul_bari_java;

import java.util.Scanner;

public class display_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        int rem=0;
        while(num>0){
            rem=num%10;
            num=num/10;
            System.out.println("digits are:" +rem);
        }

    }
}

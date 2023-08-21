package abdul_bari_java;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        int rev=0;
        int rem = 0;
        while (num > 0) {
            rem = num % 10;
            rev=rev*10+rem;
            num = num / 10;
            System.out.println("digits are:" + rem);
        }
        System.out.println("reverse of the number is: " +rev);
    }
}

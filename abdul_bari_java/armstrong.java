package abdul_bari_java;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        int holder=num;
        int rem = 0;
        int sum = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = sum+(rem*rem*rem);
        }
        System.out.println("sum of digits are:" + sum);
        if(holder==sum){
            System.out.println("ARMSTRONG");
        }
        else{
            System.out.println("NON ARMSTRONG");
        }
    }
}

package abdul_bari_java;

import java.util.Scanner;

public class sum_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            //System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }
}

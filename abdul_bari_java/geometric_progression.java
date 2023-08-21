package abdul_bari_java;

import java.util.Scanner;

public class geometric_progression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int a = scanner.nextInt();
        System.out.println("Enter a the difference");
        int d = scanner.nextInt();
        System.out.println("Enter the range");
        int n = scanner.nextInt();
        int sum=0;
        for(int i=0;i<n;i++) {
            System.out.println(a);
            a = a * d;


        }   }
}

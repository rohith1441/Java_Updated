package abdul_bari_java;

import java.util.Scanner;

public class quadratic_equation {
    public static void main(String[] args) {
        int a,b,c;
        double r1,r2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        a = scanner.nextInt();
        System.out.println("Enter b:");
        b = scanner.nextInt();
        System.out.println("Enter c:");
        c = scanner.nextInt();
        int s = (b*b)-4*a*c;
        r1 = (-(b)+Math.sqrt(s))/2*a;
        r2 = (-(b)-Math.sqrt(s))/2*a;
        System.out.println("roots are " +r1+ "and" +r2);

    }
}

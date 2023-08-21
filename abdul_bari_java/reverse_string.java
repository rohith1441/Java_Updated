package abdul_bari_java;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner scanner = new Scanner(System.in);
        String s= scanner.next();
        String reverse = new StringBuffer(s).reverse().toString();
        System.out.println(reverse);
        if(s.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("No Palindrome");
        }

    }
}

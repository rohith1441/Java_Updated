package abdul_bari_java;

import java.util.Scanner;

public class primeORnot {
    static String prime(int x){
        int count =0;
        String ans=" ";

        for(int i=1;i<=x;i++) {
            if(x%i==0){
                count++;
            }
        if(count>2){
            ans="Not Prime";
        }
        else{
            ans="Prime";
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x=scanner.nextInt();
        String answer=prime(x);
        System.out.println(answer);
    }
}

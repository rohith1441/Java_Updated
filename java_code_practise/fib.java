package java_code_practise;

import java.util.Scanner;

public class fib {
    int num;
    public fib(int num){
        this.num = num;
    }
    public int fibo(int num){
        if(num==0){
            return 0;
        }
        else if(num==1 || num==2){
            return 1;
        }
        else{
            return fibo(num-1) + fibo(num-2);
        }
    }

    public static void main(String[] args) {
        fib fib1 = new fib(1);
        System.out.println("enter an number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(fib1.fibo(i));
        }
    }
}

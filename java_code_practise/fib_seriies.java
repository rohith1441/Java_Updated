package java_code_practise;

import java.util.Scanner;

public class fib_seriies {
    public static void main(String[] args) {
        System.out.println("enter an number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum=0;
        int num1=0,num2=1;
        for(int i =0; i<=num; i++){
            if(num==0){
                System.out.println(num1);
            }
            else if(num==1 || num==2){
                System.out.println(num2);
            }
            else{
                System.out.println(num1);
                sum = num1 + num2;
                num1 = num2;
                num2 = sum;

            }
        }
    }
}

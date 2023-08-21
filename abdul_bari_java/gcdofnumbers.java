package abdul_bari_java;

import java.util.Scanner;

public class gcdofnumbers {
    static int gcd(int x,int y){
        int gcd1=0;
        if(x==0 || y==0){
            return gcd1;
        }
        else{
            while(x!=y){
                if(x>y){
                    x=x-y;
                } else {
                    y=y-x;
                }
            }
            gcd1=x;
        }
        return gcd1;
    }

    public static void main(String[] args) {
        //int ans = gcd(12,36);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x=scanner.nextInt();
        System.out.print("Enter Y: ");
        int y =scanner.nextInt();
        int ans = gcd(x,y);
        System.out.println("Gcd is "+ans);
}
}
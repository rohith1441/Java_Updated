package java_code_practise;

import java.util.Scanner;

public class tdarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][]= new int[4][3];
        System.out.println(arr[0].length);
        System.out.println(arr.length);
        for(int  i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=scanner.nextInt();

            }
        }
        for(int x[]:arr){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println(" ");
        }
    }
}

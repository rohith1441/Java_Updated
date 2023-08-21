package abdul_bari_java;

import java.util.Scanner;

public class max_of_array_fuction {
    static int maxarray(int[] arrs){
        int max_num = arrs[0];
        for(int i=1;i<arrs.length;i++){
            if(max_num<arrs[i]){
                max_num=arrs[i];
            }
        }
        return max_num;

    }

    public static void main(String[] args) {
        System.out.println("Enter the range of array: ");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr =new int[n];
        //arr[0]=scanner.nextInt();
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the "+ (i+1) +" st element: ");
            arr[i]=scanner.nextInt();
        }
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println(" ");
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println(" ");
        int max=maxarray(arr);
        System.out.println("Max is: "+max);
    }
}

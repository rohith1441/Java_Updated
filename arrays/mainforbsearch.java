package arrays;

import java.util.Scanner;

public class mainforbsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        binarysearch bs = new binarysearch();
        int arr[] = new int[5];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("search element");
        int num = sc.nextInt();
        int n = arr.length;
        int result = bs.binsearch(arr,0,n-1,num);
        if(result==-1)
            System.out.println("element not found");
        else
            System.out.println("Element" +num+ "found at index" +result);
    }
}

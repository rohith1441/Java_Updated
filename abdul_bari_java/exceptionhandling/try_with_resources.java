package abdul_bari_java.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class try_with_resources {
    //static FileInputStream fi;
   // static Scanner sc;
    static void Divide() throws Exception {
        //fi = new FileInputStream("C:\\Users\\Rohith Valupadasu\\Desktop\\test.txt");
        try (FileInputStream fi = new FileInputStream("C:\\Users\\Rohith Valupadasu\\Desktop\\test.txt");Scanner sc = new Scanner(fi)) {

           // sc = new Scanner(fi);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(b / a);
        }

    }
    public static void main(String[] args) throws Exception {
        try{
        Divide();}
        catch (Exception e) {
            //int x = sc.nextInt();
            System.out.println(e);
        }
    }
}

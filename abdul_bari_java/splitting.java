package abdul_bari_java;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class splitting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = scanner.nextInt();
        String[] empty_str;
        String[] final_str = new String[0];
        scanner.nextLine();
        while(number >0){
            String str = scanner.nextLine();
            //System.out.println(str);
            empty_str = str.split(" ");
            //Arrays.stream(empty_str).distinct().toString();
            for (int i = 0; i < empty_str.length; i++)
            {
                // Check if the picked element
                // is already printed
                int j;
                for (j = 0; j < i; j++)
                    if (empty_str[i].equals(empty_str[j]))
                        break;

                // If not printed earlier,
                // then print it
                if (i == j)
                   // final_str[i] = empty_str[i]+" ";
                    System.out.print( empty_str[i] + " ");
            }
            //String str1 =final_str.toString();
           //System.out.println(str1);
            System.out.println(" ");
            number--;
        }

        }
    }


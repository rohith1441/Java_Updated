package abdul_bari_java;

import java.util.Scanner;

public class switch2_prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a URL: ");
        String url = sc.nextLine();
        while(url.length()!=0){
        int ind = url.indexOf(":");
        int ind2 = url.indexOf(".");
        int ind3 = url.indexOf(".", ind2 + 1);
        String website = url.substring(ind3 + 1, url.length());
        System.out.println(website);
        switch (website) {
            case "org":
                System.out.println("organisation");
                break;
            case "gov":
                System.out.println("government");
                break;
            case "com":
                System.out.println("commercial");
                break;
            default:
                System.out.println("Unkown");
        }
            System.out.println("Enter a URL");
            url = sc.nextLine();
        }
    }
}

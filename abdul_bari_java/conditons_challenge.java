package abdul_bari_java;

import java.util.Scanner;

public class conditons_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a URL: ");
        String url = sc.nextLine();
        int ind = url.indexOf(":");
        String protocol = url.substring(0,ind);
        System.out.println(protocol);
        if(protocol.equals("http")){
            System.out.println("Hypertext Transfer Protocol");
        }
        else{
            System.out.println("File transfer Protocal");
        }
        int ind2 = url.indexOf(".");
        int ind3 = url.indexOf(".",ind2+1);
        String website = url.substring(ind3+1,url.length());
        System.out.println(website);
        if(website.equals("com")){
            System.out.println("commercial");
        }
        else if(website.equals("org")){
            System.out.println("Organization");
        }
        else{
            System.out.println("notwork");
        }

    }
}

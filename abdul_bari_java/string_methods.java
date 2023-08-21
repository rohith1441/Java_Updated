package abdul_bari_java;

import java.util.Locale;

public class string_methods {
    public static void main(String[] args) {
        String str = "•Python course by Kaggle.";
        int l = str.length();
        System.out.println(l);
        String low = str.toLowerCase();
        System.out.println(low);
        String up = str.toUpperCase();
        System.out.println(up);
        String str1="   Welcome   ";
        System.out.println(str1.trim());
        System.out.println(str1.substring(4));
        System.out.println(str1.substring(3,6));
        System.out.println(str1.replace(' ','r'));
        String str3 = "www.abcd.org";
        System.out.println(str3.startsWith("www"));
        System.out.println(str3.startsWith("http"));
        System.out.println(str3.endsWith("org"));
        System.out.println(str3.endsWith("com"));
        System.out.println(str3.charAt(9));
        System.out.println(str3.indexOf("."));
        System.out.println(str3.indexOf(".",4));
        System.out.println(str3.indexOf("?"));
        System.out.println(str3.indexOf("ab"));
        System.out.println(str3.lastIndexOf("."));
        System.out.println(str3.indexOf(".",7));
        String str4= "JAVA";
        String str5= "java";
        String str6= "python";
        String str7= "python";
        System.out.println(str6.equals(str7));
        System.out.println(str4.equals(str5));
        System.out.println(str4.equalsIgnoreCase(str6));
        System.out.println(str5.compareTo(str6));
        System.out.println(str6.compareTo(str5));

        // Quantifiers

        String str11 = "abcbbccbcccbc";
        System.out.println(str11.matches("[a-z]*"));
        System.out.println(str11.matches("[a-z]+"));
        System.out.println(str11.matches("[a-z]{6}"));
        System.out.println(str11.matches("[a-z]{3,15}"));
        System.out.println(str11.matches("[a-z][0-9]*"));

        String str12 = "rohith@gmail.com";
        System.out.println(str12.matches(".*gmail.*"));





    }
}

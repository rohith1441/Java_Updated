package abdul_bari_java;

public class re_exp_3 {
    public static void main(String[] args) {
        //Removing Special chars
        String str = "a!B@c#1$2%3";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

        //Removing extra spaces
        String str1 = "   abc     fhg   lsjf  ";
        System.out.println(str1.replaceAll("\\s+ "," "));

        str1 = str1.replaceAll("\\s+ "," ").trim();
        String words[] =str1.split("\\s");
        System.out.println(words.length);


    }
}

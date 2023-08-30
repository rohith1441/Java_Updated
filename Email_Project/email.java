package Email_Project;

import java.util.Scanner;

public class email {
    private String first_name;
    private String last_name;
    private String Password;
    private int deflength =10;
    int mail_capacity =  500;
    private String company="google";
    private String departmentt;
    private String alternate_email;
    private String change_password;

    email(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
        System.out.println("1 sales"+"\n2 Development"+"\n3 accounting"+"\n4 No Department");
        System.out.println("Select your department:");
        this.departmentt = department();
        this.Password = passwordGen(deflength);

    }
    private String getEmail(){
        return (first_name+"."+last_name+"@"+departmentt+"."+company+"."+"com");
    }
    private String passwordGen(int length){
        String characs="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()_+=-';,./]{}";
        char[] chars = new char[length];
        for(int i =0;i<length;i++){
            int rand = (int)(Math.random()*characs.length());
            chars[i]=characs.charAt(rand);
        }return  new String(chars);

    }
    private String department(){
        //String dep=" ";
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num==1){
            return "sales";
        }
        else if(num==2){
            return "Development";
        }
        else if(num==3){
            return "accounting";
        }
        else{
            return "";
        }

    }
    public void setAlternate_email(String alternate_email){
        this.alternate_email = alternate_email;
        //return alternate_email;
    }
    public String getAlternate_email(){
        return alternate_email;
    }

    public void setMail_capacity(int mail_capacity){
        this.mail_capacity = mail_capacity;
        //return mail_capacity;
    }

    public int getMail_capacity() {
        return mail_capacity;
    }

    public void setChange_password(String change_password) {
        this.change_password = change_password;
    }

    public String getChange_password() {
        return change_password;
    }

    public String getPassword() {
        return Password;
    }

    public void getInfo(){
        //return ("Welcome: "+first_name+"."+last_name+"@"+departmentt+"."+company+"."+"com");
        System.out.println("Email: "+getEmail()+"\nAlternate_email: "+getAlternate_email()+"\nDepartment: "+departmentt
        +"\nMail Capacity: "+getMail_capacity()+"\nDefaultPassword: "+getPassword()+"\nNew Password: "+change_password);
    }
}
